package com.paymentadapter;

/**
 * Turbo payment is an interface that is used by Turbo Payment methods.
 * This interface do payment by payInTurbo method.
 * @author Furkan Kalabalık
 *
 */
public interface TurboPayment {
	
	/**
	 * Turbo payment method's pay function used to do payment by using Turbo Payment Method.
	 * @param turboCardNo Card no will be take money
	 * @param turboAmount Amount of money that will be paid
	 * @param destinationTurboOfCourse Destination of money
	 * @param installmentsButInTurbo Installment
	 * @return On success returns 0
	 */
	int payInTurbo (String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo);
}
