package com.iflas;

/**
 * Implements CaseSpec interface.
 * Creates waterproof depth limit specification up to 2m for
 * Turkey Market.
 * @author Furkan Kalabalık
 *
 */
public class WaterUpTo2m implements CaseSpec {
	
	/**
	 * Returns waterproof depth limit specification up to 2m specification, in string format
	 */
	public String toString()
	{
		String m2 = "Waterproof up to 2m";
		return m2;
	}
}
