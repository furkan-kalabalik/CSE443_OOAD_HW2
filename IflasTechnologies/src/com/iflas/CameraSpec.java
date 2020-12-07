package com.iflas;

/**
 * Interface for Regional Camera specifications.
 * It implements toString method for specify, optic zoom
 * degree.
 * @author Furkan Kalabalık
 *
 */
public interface CameraSpec {
	
	/**
	 * Generates optic zoom degree specification.
	 * @return optic zoom degree number in string
	 */
	public String toString();
}	
