package com.paymentadapter;

/**
 * This is the adapter class that implements TurboPayment interface,
 * but takes ModernPayment object as input to use ModernPayment method 
 * inside TurboPayment method. This class adapts Modern payment to Turbo payment
 * method. With that we can use ModernPayment in places that require Turbo payment.
 * @author Furkan Kalabalık
 *
 */
public class ModernPaymentAdapter implements TurboPayment {
	
	/**
	 * Modern Payment class that will be adapted
	 */
	private ModernPayment modernPayment;
	
	/**
	 * Constructor takes a ModernPayment class, than uses that to adapt to TurboPayment.
	 * @param modernPayment ModernPayment that will be adapted.
	 */
	public ModernPaymentAdapter(ModernPayment modernPayment)
	{
		this.modernPayment = modernPayment;
	}
	
	/**
	 * Adapts modern payment method to turbo payment by calling pay method inside payInTurbo method.
	 */
	@Override
	public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse,
			String installmentsButInTurbo) {
		modernPayment.pay(turboCardNo, turboAmount, destinationTurboOfCourse, installmentsButInTurbo);
		return 0;
	}

}
