package com.fourier;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is base class for calculation methods. This class has a template method
 * for calculating 1D Fourier called calculateFourier. Since this is a abstract class
 * calculation methods implemented in child classes but template method will remain same. 
 * @author Furkan Kalabalık
 *
 */
public abstract class FourierCalculation {
	
	private static int id = 0;
	/**
	 * Template method of Fourier Calculation.
	 * Reads N inputs from given file.
	 * Calculate outputs for implemented method.
	 * Write output to file.
	 * @param inputFile input file tab separated real numbers
	 */
	public final void calculateFourier(String inputFile)
	{
		ArrayList<Double> input = readFromFile(inputFile);
		long start = System.nanoTime();
		String result = calculate(input);
		long end = System.nanoTime();
		if(isPrintExecutionTime())
			System.out.printf("Calculation done in %d ms\n", (end-start)/1000000);
		writeToFile(result);
		return;
	}
	
	
	/**
	 * Reads tab separated file an puts numbers in a ArrayList.
	 * @param filename file to be read for inputs
	 * @return input numbers in ArrayList
	 */
	private ArrayList<Double> readFromFile(String filename)
	{
		ArrayList<Double> inputList = new ArrayList<>();
		String[] splitted;
		try 
		{
			File file = new File(filename);
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine())
			{
				splitted = sc.nextLine().split("\t");
				for(int i = 0; i < splitted.length; i++)
					inputList.add(Double.valueOf(splitted[i]));
			}
			sc.close();
			return inputList;
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error while opening input file");
			e.printStackTrace();
			return null;
		}
		
	}
	
	/**
	 * This method takes String output of Fourier Calculation and write result to file.
	 * @param result Result of Fourier Calculation in String format
	 */
	private void writeToFile(String result)
	{
		String filename = String.format("output-%d.txt", id++);
		File newFile = new File(filename);
		try {
			newFile.createNewFile();
			FileWriter fw = new FileWriter(newFile);
			fw.flush();
			fw.write(result);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is changes during among different calculation methods.
	 * Takes given input list and creates String output for calculation method. (DFT or DCT)
	 * @param input input list for calculation
	 * @return Output of calculation in String format.
	 */
	public abstract String calculate(ArrayList<Double> input);
	
	/**
	 * This is the hook method. This method used to determine whether execution
	 * time will be printed on screen or not. By default this is false but in any child class
	 * this method can be overwrite so it can be made true or can be asked to user whether execution
	 * time will be printed screen or not
	 * @return true or false, whether execution time will be printed or not.
	 */
	boolean isPrintExecutionTime()//Hook
	{
		return false;
	}
}
