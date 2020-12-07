package com.iflas;

/**
 * Implements CameraSpec interface.
 * Creates x3 optic zoom specification for
 * EU Market.
 * @author Furkan Kalabalık
 *
 */
public class ZoomX3 implements CameraSpec {
	
	/**
	 * Returns x3 optic zoom specification, in string format
	 */
	public String toString()
	{
		String x3 = "Optic zoom x3";
		return x3;
	}
}
