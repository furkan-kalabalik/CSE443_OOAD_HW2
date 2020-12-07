package com.fourier;

import java.util.ArrayList;

/**
 * This class uses Discrete Cosine Transform to calculate Fourier transform.
 * @author Furkan Kalabalık
 *
 */
public class DCT extends FourierCalculation{
	
	/**
	 * This method implements DCT algorithm. Then returns the real number results in String format.
	 */
	public String calculate(ArrayList<Double> input)
	{
		int N = input.size();
		ArrayList<Double> output = new ArrayList<Double>();
		String result = "";
		double total;
		for(int k = 0; k < N; k++)
		{
			total = 0;
			for(int n = 0; n < N; n++)
			{
				total += input.get(n) * Math.cos( (Math.PI/N) * (n+0.5) * k);
			}
			output.add(Double.valueOf(total));
		}
		
		for(Double out: output)
			result += String.format("%.3f", out.doubleValue()) + "\t";
		
		return result;
	}
}
