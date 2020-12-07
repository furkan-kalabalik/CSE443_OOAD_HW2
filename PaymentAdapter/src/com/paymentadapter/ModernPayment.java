package com.paymentadapter;


/**
 * Modern payment is an interface that is used by Modern Payment methods.
 * This interface do payment by pay method.
 * @author Furkan Kalabalık
 *
 */
public interface ModernPayment {
	
	/**
	 * Modern payment method's pay function used to do payment by using Modern Payment Method.
	 * @param cardNo Card no will be take money
	 * @param amount Amount of money that will be paid
	 * @param destination Destination of money
	 * @param installments Installment
	 * @return On success returns 0
	 */
	int pay(String cardNo, float amount, String destination, String installments);
}
