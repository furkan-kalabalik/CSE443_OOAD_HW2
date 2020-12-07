package com.iflas;

/**
 * EU phone store. This store creates phone for EU market.
 * Because it only serve to EU market, it must generate components
 * for EU market. It uses EU Component Factory to generate regional components.
 * Extends PhoneStore and implements createPhone method with help of
 * EuComponentFactory.
 * @author Furkan Kalabalık
 *
 */
public class EuPhoneStore extends PhoneStore {
	
	/**
	 *This method implements abstract method of Phone Store.
	 *Takes desired phone model. Then creates its factory for regional 
	 *specifications. Then according to desired model, creates that model
	 *with regional factory. Then return created phone.
	 *@param model Phone model that ordered
	 *@return Desired phone model with regional specifications and base specifications.
	 */
	protected Phone createPhone(PhoneModel model)
	{
		Phone phone = null;
		System.out.println("Components will be producted at Eu Component Factory");
		EuComponentFactory componentFactory = new EuComponentFactory();
		
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
