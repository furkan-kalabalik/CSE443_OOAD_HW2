package com.iflas;

/**
 * Implements CaseSpec interface.
 * Creates waterproof depth limit specification up to 50cm for
 * Global Market.
 * @author Furkan Kalabalık
 *
 */
public class WaterUpTo50cm implements CaseSpec {
	
	/**
	 * Returns waterproof depth limit specification up to 50cm specification, in string format
	 */
	public String toString()
	{
		String cm = "Waterproof up to 50cm";
		return cm;
	}
}
