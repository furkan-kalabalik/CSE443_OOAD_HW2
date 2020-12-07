package com.paymentadapter;

/**
 * Class that uses ModernPayment interface to make payments.
 * @author Furkan Kalabalık
 *
 */
public class ModernPaymentClass implements ModernPayment {
	
	/**
	 *This method makes payment with using Modern Payment.
	 */
	@Override
	public int pay(String cardNo, float amount, String destination, String installments) {
		System.out.println("Card no: " + cardNo);
		System.out.printf("Payment amount: %.3f\n", amount);
		System.out.println("Destination: "+ destination);
		System.out.println("Installments: " + installments);
		System.out.println("Payment done with ModernPayment method");
		return 0;
	}

}
