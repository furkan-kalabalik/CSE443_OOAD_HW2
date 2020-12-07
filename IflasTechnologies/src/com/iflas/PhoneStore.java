package com.iflas;


/**
 * Base class for phone stores. This class takes order of phone model,
 * Then calls createPhone method for create phone model. Create phone is
 * implemented in child classes. It creates phone model with regional component
 * factory. Then orderPhone builds phone with regional components, attach other 
 * base components and return the order.
 * @author Furkan Kalabalık
 *
 */
public abstract class PhoneStore {
	
	/**Abstract method of creating phone. This method implemented in 
	 * child classes. Creates phone model with base components plus
	 * additional regional components with help of component factory.
	 * @param model Phone model will be created in enum form.
	 * @return Desired phone model, with regional specifications.
	 */
	protected abstract Phone createPhone(PhoneModel model);
	
	
	/**
	 * This method is base method for one order of phone.
	 * It forces other phone stores to apply same procedure
	 * for every order with help of final keyword. Creates phone,
	 * and its component, attach base components, then return the ordered phone.
	 * @param model Desired phone model
	 * @return Phone model with regional specifications.
	 */
	public final Phone orderPhone(PhoneModel model)
	{
		Phone order = createPhone(model);
		order.buildPhone();
		order.attachCPU_RAM();
		order.attachDisplay();
		order.attachBattery();
		order.attachStorage();
		order.attachCamera();
		order.encloseCase();
		return order;
	}
}
