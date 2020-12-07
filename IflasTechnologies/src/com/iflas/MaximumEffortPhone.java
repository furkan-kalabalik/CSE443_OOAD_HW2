package com.iflas;

/**
 * This class derives Phone class. It creates Phone model called
 * MaximumEffort. It creates phone with base model specifications.
 * Additionally, with help of given component factory, adds regional specifications
 * to the phone.
 * @author Furkan Kalabalık
 *
 */
public class MaximumEffortPhone extends Phone{
	/**
	 * Phone component factory that is used to generate regional specifications.
	 */
	private PhoneComponentFactory componentFactory;
	
	/**
	 * Constructor of MaximumEffort. This class generates base specification for the phone.
	 * Takes a factory to create regional components. 
	 * @param componentFactory Factory to product regional components for that phone.
	 */
	public MaximumEffortPhone(PhoneComponentFactory componentFactory)
	{
		super("MaximumEffort", "5.5 inches", "27h 3600mAh", "2.8Ghz, 8GB", "MicroSD support, 64GB", "12Mp front, 8Mp rear", "151x73x7.7 mm, dustproof, waterproof, aluminum");
		this.componentFactory = componentFactory;
	}
	
	/**
	 *Using component factory, creates regional specification of phone for every specification.
	 */
	public void buildPhone()
	{
		System.out.println("Building Maximum Effort Model");
		batterySpec = componentFactory.createBatterySpec();
		cameraSpec = componentFactory.createCameraSpec();
		caseSpec = componentFactory.createCaseSpec();
		cpuRamSpec = componentFactory.createCpuRamSpec();
		displaySpec = componentFactory.createDisplaySpec();
		storageSpec = componentFactory.createStorageSpec();
	}
}
