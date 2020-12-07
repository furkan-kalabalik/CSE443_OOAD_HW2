package com.iflas;

/**
 * Implements CpuRamSpec interface.
 * Creates 4 core CPU specification for
 * EU Market.
 * @author Furkan Kalabalık
 *
 */
public class Core4 implements CpuRamSpec {
	
	/**
	 * Returns 4 core CPU specification, in string format
	 */
	public String toString()
	{
		String core4 = "4 core";
		return core4;
	}
}
