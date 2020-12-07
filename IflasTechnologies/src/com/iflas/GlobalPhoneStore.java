package com.iflas;

/**
 * Global phone store. This store creates phone for global market.
 * Because it only serve to global market, it must generate components
 * for global market. It uses Global Component Factory to generate regional components.
 * Extends PhoneStore and implements createPhone method with help of
 * GlobalComponentFactory.
 * @author Furkan Kalabalık
 *
 */
public class GlobalPhoneStore extends PhoneStore {
	
	protected Phone createPhone(PhoneModel model)
	{
		Phone phone = null;
		GlobalComponentFactory componentFactory = new GlobalComponentFactory();
		System.out.println("Components will be producted at Global Component Factory");
		
		switch(model)
		{
		case MaximumEffort:
			phone = new MaximumEffortPhone(componentFactory);
			break;
		case IflasDeluxe:
			phone = new IflasDeluxePhone(componentFactory);
			break;
		case AmanIflas:
			phone = new AmanIflasPhone(componentFactory);
			break;
		default:
			System.out.println("Unknown model type");
		}
		return phone;
	}
}
