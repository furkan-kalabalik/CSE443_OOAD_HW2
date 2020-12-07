package com.fourier;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class uses Discrete Fourier Transform to calculate Fourier transform.
 * Also overwrite's to hook so user is decide whether execution time will be printed or not.
 * @author Furkan Kalabalık
 *
 */
public class DFT extends FourierCalculation{
	
	/**
	 * This method implements DFT algorithm. Then returns the complex results in String format.
	 */
	public String calculate(ArrayList<Double> input)
	{
		ArrayList<ComplexNumber> outputComplex = new ArrayList<ComplexNumber>();
		int N = input.size();
		ComplexNumber total;
		String result = "";
		for(int k = 0; k < N; k++)
		{
			total = new ComplexNumber(0,0);
			for(int n = 0; n < N; n++)
			{
				ComplexNumber x_n = new ComplexNumber(input.get(n), 0);
				x_n = x_n.multiplication(new ComplexNumber( Math.cos( (2*Math.PI/N) * k * n ) , -Math.sin( (2*Math.PI/N) * k * n ) ));
				total = total.addition(x_n);	
			}
			outputComplex.add(total);
		}
		for(ComplexNumber complexNumber: outputComplex)
			result += complexNumber.toString() + "\t";
		return result;
	}
	
	/**
	 * This method overwrite hook method to let user decide whether execution time will be printed or not.
	 */
	boolean isPrintExecutionTime()//Hook
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you want to see execution time?(y/n): ");
		String answer = sc.nextLine();
		sc.close();
		if(answer.equals(new String("y")))
			return true;
		else if(answer.equals(new String("n")))
			return false;
		else
			System.out.println("Wrong input! By default, execution time will not be provided!");
		return false;
	}
}
