package com.iflas;

/**
 * Implements CameraSpec interface.
 * Creates x2 optic zoom specification for
 * Global Market.
 * @author Furkan Kalabalık
 *
 */
public class ZoomX2 implements CameraSpec {
	
	/**
	 * Returns x2 optic zoom specification, in string format
	 */
	public String toString()
	{
		String x2 = "Optic zoom x2";
		return x2;
	}
}
