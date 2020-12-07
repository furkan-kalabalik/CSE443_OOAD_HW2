package com.iflas;

/**
 * Implements StorageSpec interface.
 * Creates maximum 32GB  
 * SD card support for
 * Global Market.
 * @author Furkan Kalabalık
 *
 */
public class Max32 implements StorageSpec {
	
	/**
	 * Returns maximum 32GB SD card support, in string format
	 */
	public String toString()
	{
		String max32 = "Max 32GB";
		return max32;
	}
}
