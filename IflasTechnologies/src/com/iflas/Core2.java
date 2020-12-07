package com.iflas;

/**
 * Implements CpuRamSpec interface.
 * Creates 2 core CPU specification for
 * Global Market.
 * @author Furkan Kalabalık
 *
 */
public class Core2 implements CpuRamSpec {
	
	/**
	 * Returns 2 core CPU specification, in string format
	 */
	public String toString()
	{
		String core2 = "2 core";
		return core2;
	}
}
