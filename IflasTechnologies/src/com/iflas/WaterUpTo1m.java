package com.iflas;

/**
 * Implements CaseSpec interface.
 * Creates waterproof depth limit specification up to 1m for
 * EU Market.
 * @author Furkan Kalabalık
 *
 */
public class WaterUpTo1m implements CaseSpec{
	
	/**
	 * Returns waterproof depth limit specification up to 1m specification, in string format
	 */
	public String toString()
	{
		String m1 = "Waterproof up to 1m";
		return m1;
	}
}
