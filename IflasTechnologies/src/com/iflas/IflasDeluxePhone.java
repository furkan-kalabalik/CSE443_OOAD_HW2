package com.iflas;

/**
 * This class derives Phone class. It creates Phone model called
 * IflasDeluxe. It creates phone with base model specifications.
 * Additionally, with help of given component factory, adds regional specifications
 * to the phone.
 * @author Furkan Kalabalık
 *
 */
public class IflasDeluxePhone extends Phone{
	/**
	 * Phone component factory that is used to generate regional specifications.
	 */
	private PhoneComponentFactory componentFactory;
	
	/**
	 * Constructor of IflasDeluxe. This class generates base specification for the phone.
	 * Takes a factory to create regional components. 
	 * @param componentFactory Factory to product regional components for that phone.
	 */
	public IflasDeluxePhone(PhoneComponentFactory componentFactory)
	{
		super("IflasDeluxe", "5.3 inches", "20h 2800mAh", "2.2Ghz, 6GB", "MicroSD support, 32GB", "12Mp front, 5Mp rear", "149x73x7.7 mm, waterproof, aluminum");
		this.componentFactory = componentFactory;
	}
	
	/**
	 *Using component factory, creates regional specification of phone for every specification.
	 */
	public void buildPhone()
	{
		System.out.println("Building Iflas Deluxe Model");
		batterySpec = componentFactory.createBatterySpec();
		cameraSpec = componentFactory.createCameraSpec();
		caseSpec = componentFactory.createCaseSpec();
		cpuRamSpec = componentFactory.createCpuRamSpec();
		displaySpec = componentFactory.createDisplaySpec();
		storageSpec = componentFactory.createStorageSpec();
	}
}
