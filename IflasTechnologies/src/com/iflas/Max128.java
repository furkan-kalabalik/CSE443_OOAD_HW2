package com.iflas;

/**
 * Implements StorageSpec interface.
 * Creates maximum 128GB  
 * SD card support for
 * Turkey Market.
 * @author Furkan Kalabalık
 *
 */
public class Max128 implements StorageSpec {
	
	/**
	 * Returns maximum 128GB SD card support, in string format
	 */
	public String toString()
	{
		String max128 = "Max 128GB";
		return max128;
	}
}
