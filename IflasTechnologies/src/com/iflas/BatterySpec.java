package com.iflas;

/**
 * Interface for Regional Battery specifications.
 * It implements toString method for specify, battery 
 * matter type.
 * @author Furkan Kalabalık
 *
 */
public interface BatterySpec {
	/**
	 * Generates battery matter type.
	 * @return Battery matter type in string
	 */
	public String toString();
}
