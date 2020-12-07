package com.iflas;


/**
 * This class derives Phone class. It creates Phone model called
 * I-I-Aman-Iflas. It creates phone with base model specifications.
 * Additionally, with help of given component factory, adds regional specifications
 * to the phone.
 * @author Furkan Kalabalık
 *
 */
public class AmanIflasPhone extends Phone{
	
	/**
	 * Phone component factory that is used to generate regional specifications.
	 */
	private PhoneComponentFactory componentFactory;
	
	/**
	 * Constructor of I-I-Aman-Iflas. This class generates base specification for the phone.
	 * Takes a factory to create regional components. 
	 * @param componentFactory Factory to product regional components for that phone.
	 */
	public AmanIflasPhone(PhoneComponentFactory componentFactory)
	{
		super("I-I-Aman-Iflas", "4.5 inches", "16h 2000mAh", "2.2Ghz, 4GB", "MicroSD support, 16GB", "8Mp front, 5Mp rear", "143x69x7.3 mm, waterproof, plastic");
		this.componentFactory = componentFactory;
	}
	
	
	/**
	 *Using component factory, creates regional specification of phone for every specification.
	 */
	public void buildPhone()
	{
		System.out.println("Building I-I-Aman-Iflas Model");
		batterySpec = componentFactory.createBatterySpec();
		cameraSpec = componentFactory.createCameraSpec();
		caseSpec = componentFactory.createCaseSpec();
		cpuRamSpec = componentFactory.createCpuRamSpec();
		displaySpec = componentFactory.createDisplaySpec();
		storageSpec = componentFactory.createStorageSpec();
	}
}
