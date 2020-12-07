package com.fourier;


/**
 * Helper class used to represent Complex number.
 * It makes calculation of Complex number and prints 
 * Complex numbers in nice format
 * @author Furkan Kalabalık
 *
 */
public class ComplexNumber {
	
	/**
	 * Real part of ComplexNumber 
	 */
	private double real;
	
	/**
	 * Imaginary part of ComplexNumber 
	 */
	private double imaginary;
	
	/**
	 * Complex number constructor takes real and imaginary part and creates Complex Number
	 * @param real real part of complex number
	 * @param imaginary imaginary part of complex number
	 */
	public ComplexNumber(double real, double imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	
	/**
	 * Add given complex number with this complex number
	 * @param other Other complex number
	 * @return Calculated Complex number for addition
	 */
	public ComplexNumber addition(ComplexNumber other)
	{
		return new ComplexNumber(this.real+other.real, this.imaginary+other.imaginary);
	}
	
	/**
	 * Subtraction of given complex number with this complex number
	 * @param other Other complex number
	 * @return Calculated Complex number for substution
	 */
	public ComplexNumber substraction(ComplexNumber other)
	{
		return new ComplexNumber(this.real-other.real, this.imaginary-other.imaginary);
	}
	
	/**
	 * Multiplicate given complex number with this complex number
	 * @param other Other complex number
	 * @return Calculated Complex number for multiplication
	 */
	public ComplexNumber multiplication(ComplexNumber other)
	{
		return new ComplexNumber((this.real * other.real) - (this.imaginary * other.imaginary), 
				(this.real * other.imaginary) + (this.imaginary * other.real));
	}
	
	
	/**
	 * Nicely formatted String version of ComplexNumber
	 */
	public String toString()
	{
		String data = String.format("%.3f", real);
		if(this.imaginary >= 0)
			data += "+";
		data += String.format("%.3fi", imaginary);
		return data;
	}
}
