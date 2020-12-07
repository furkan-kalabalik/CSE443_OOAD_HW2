package com.iflas;


/**
 * Turkey phone store. This store creates phone for Turkey market.
 * Because it only serve to Turkey market, it must generate components
 * for Turkey market. It uses Turkey Component Factory to generate regional components.
 * Extends PhoneStore and implements createPhone method with help of
 * TurkeyComponentFactory.
 * @author Furkan Kalabalık
 *
 */
public class TurkeyPhoneStore extends PhoneStore {
	
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
		TurkeyComponentFactory componentFactory = new TurkeyComponentFactory();
		System.out.println("Components will be producted at Turkey Component Factory");
		
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
