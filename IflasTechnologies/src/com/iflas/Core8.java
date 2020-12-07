package com.iflas;

/**
 * Implements CpuRamSpec interface.
 * Creates 8 core CPU specification for
 * Turkey Market.
 * @author Furkan Kalabalık
 *
 */
public class Core8 implements CpuRamSpec {
	
	/**
	 * Returns 8 core CPU specification, in string format
	 */
	public String toString()
	{
		String core8 = "8 core";
		return core8;
	}
}
