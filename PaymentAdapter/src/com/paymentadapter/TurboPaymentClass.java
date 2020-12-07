package com.paymentadapter;

/**
 * Class that uses TurboPayment interface to make payments.
 * @author Furkan Kalabalık
 *
 */
public class TurboPaymentClass implements TurboPayment {

	/**
	 *This method makes payment with using Turbo Payment.
	 */
	@Override
	public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse,
			String installmentsButInTurbo) {
		System.out.println("Card no: " + turboCardNo);
		System.out.printf("Payment amount: %.3f\n", turboAmount);
		System.out.println("Destination: "+ destinationTurboOfCourse);
		System.out.println("Installments: " + installmentsButInTurbo);
		System.out.println("Payment done with TurboPayment method");
		return 0;
	}

}
