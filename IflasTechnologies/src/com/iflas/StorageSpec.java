package com.iflas;

/**
 * Interface for Regional Storage specifications.
 * It implements toString method for specify, maximum support of 
 * SD card GB number.
 * @author Furkan Kalabalık
 *
 */
public interface StorageSpec {
	/**
	 * Generates maximum support of SD card GB number.
	 * @return maximum support of SD card GB number in string
	 */
	public String toString();
}
