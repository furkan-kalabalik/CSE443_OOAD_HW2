package com.iflas;

/**
 * Driver method for testing project
 * @author Furkan Kalabalık
 *
 */
public class Driver {

	/**
	 * Main method
	 * @param args command line arguments if any
	 */
	public static void main(String[] args) {
		
		System.out.println("##### Order every phone model from TURKEY store #####\n");
		PhoneStore turkeyStore = new TurkeyPhoneStore();
		
		System.out.println("\n---- MaximumEffort ----\n");
		Phone trMaxEffort = turkeyStore.orderPhone(PhoneModel.MaximumEffort);
		System.out.print(trMaxEffort);
		
		System.out.println("\n---- IflasDeluxe ----\n");
		Phone trDeluxe = turkeyStore.orderPhone(PhoneModel.IflasDeluxe);
		System.out.print(trDeluxe);
		
		System.out.println("\n---- I-I-Aman-Iflas ----\n");
		Phone trAman = turkeyStore.orderPhone(PhoneModel.AmanIflas);
		System.out.print(trAman);
		
		System.out.println("##### Order every phone model from EU store #####\n");
		PhoneStore euStore = new EuPhoneStore();
		
		System.out.println("\n---- MaximumEffort ----\n");
		Phone euMaxEffort = euStore.orderPhone(PhoneModel.MaximumEffort);
		System.out.print(euMaxEffort);
		
		System.out.println("\n---- IflasDeluxe ----\n");
		Phone euDeluxe = euStore.orderPhone(PhoneModel.IflasDeluxe);
		System.out.print(euDeluxe);
		
		System.out.println("\n---- I-I-Aman-Iflas ----\n");
		Phone euAman = euStore.orderPhone(PhoneModel.AmanIflas);
		System.out.print(euAman);
		
		System.out.println("##### Order every phone model from GLOBAL store #####\n");
		PhoneStore gbStore = new GlobalPhoneStore();
		
		System.out.println("\n---- MaximumEffort ----\n");
		Phone gbMaxEffort = gbStore.orderPhone(PhoneModel.MaximumEffort);
		System.out.print(gbMaxEffort);
		
		System.out.println("\n---- IflasDeluxe ----\n");
		Phone gbDeluxe = gbStore.orderPhone(PhoneModel.IflasDeluxe);
		System.out.print(gbDeluxe);
		
		System.out.println("\n---- I-I-Aman-Iflas ----\n");
		Phone gbAman = gbStore.orderPhone(PhoneModel.AmanIflas);
		System.out.print(gbAman);
	}

}
