package com.paymentadapter;

/**
 * Driver method for testing classes.
 * @author Furkan Kalabalık
 *
 */
public class Driver {

	/**
	 * Main method
	 * @param args command line arguments if any
	 */
	public static void main(String[] args) {
		TurboPaymentClass turboPayment = new TurboPaymentClass();
		
		ModernPaymentClass modernPayment = new ModernPaymentClass();
		ModernPaymentAdapter modernPaymentAdapter = new ModernPaymentAdapter(modernPayment);
		
		System.out.println("#### Payment in modern payment ####");
		modernPayment.pay("123456789", (float)300.24 , "Wherever i want", "some installments");
		
		System.out.println("----Replacement TEST----");
		
		System.out.println("#### Payment in turbo payment ####");
		doPayment(turboPayment);
		
		System.out.println("#### Payment in modern payment ####");
		doPayment(modernPaymentAdapter);
	}
	
	static void doPayment(TurboPayment paymentMethod)
	{
		paymentMethod.payInTurbo("123456789", (float)300.24 , "Wherever i want", "some installments");
	}
}
