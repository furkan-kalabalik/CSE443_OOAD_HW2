package com.iflas;

/**
 * Implements CameraSpec interface.
 * Creates x4 optic zoom specification for
 * Turkey Market.
 * @author Furkan Kalabalık
 *
 */
public class ZoomX4 implements CameraSpec {
	
	/**
	 * Returns x4 optic zoom specification, in string format
	 */
	public String toString()
	{
		String x4 = "Optic zoom x4";
		return x4;
	}
}
