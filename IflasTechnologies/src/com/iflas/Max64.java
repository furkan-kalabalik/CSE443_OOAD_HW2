package com.iflas;

/**
 * Implements StorageSpec interface.
 * Creates maximum 64GB  
 * SD card support for
 * EU Market.
 * @author Furkan Kalabalık
 *
 */
public class Max64 implements StorageSpec {
	
	/**
	 * Returns maximum 64GB SD card support, in string format
	 */
	public String toString()
	{
		String max64 = "Max 64GB";
		return max64;
	}
}
