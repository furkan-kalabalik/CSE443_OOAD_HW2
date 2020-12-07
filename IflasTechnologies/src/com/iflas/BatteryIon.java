package com.iflas;

/**
 * Implements BatterySpec interface.
 * Creates Ion Battery specification for
 * EU Market.
 * @author Furkan Kalabalık
 *
 */
public class BatteryIon implements BatterySpec {

	/**
	 * Returns ion battery specification, in string format
	 */
	public String toString()
	{
		String ion = "ion battery";
		return ion;
	}
}
