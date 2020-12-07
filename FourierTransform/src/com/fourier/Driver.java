package com.fourier;

/**
 * Driver method for testing classes.
 * @author Furkan Kalabalık
 *
 */
public class Driver {

	/**
	 * Main method
	 * @param args command line arguments if any, filename will be given in there
	 */
	public static void main(String[] args) {
		DFT dftFourier = new DFT();
		dftFourier.calculateFourier(args[0]);
		
		DCT dctFourier = new DCT();
		dctFourier.calculateFourier(args[0]);
	}

}
