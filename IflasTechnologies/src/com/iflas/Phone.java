package com.iflas;


/**
 * This is the base Phone Class. Every phone model derives this class.
 * It holds specification of phone model in string form. Additionally, it holds
 * regional specification of components. It creates model with, base specifications,
 * then regional specifications added in child classes with help of regional component
 * factories.
 * @author Furkan Kalabalık
 *
 */
public abstract class Phone {
	
	/**
	 * Model of the phone in string form
	 */
	private String ModelName;
	/**
	 * Display component of the phone in string form
	 */
	private String DisplayName;
	/**
	 * Battery component of the phone in string form
	 */
	private String BatteryName;
	/**
	 * Cpu and Ram component of the phone in string form
	 */
	private String CpuRamName;
	/**
	 * Storage component of the phone in string form
	 */
	private String StorageName;
	/**
	 * Camera component of the phone in string form
	 */
	private String CameraName;
	/**
	 * Case component of the phone in string form
	 */
	private String CaseName;
	
	
	/**
	 * Additional display specification, regional, filled in derived class.
	 */
	DisplaySpec displaySpec;
	/**
	 * Additional Battery specification, regional, filled in derived class.
	 */
	BatterySpec batterySpec;
	/**
	 * Additional Cpu and Ram specification, regional, filled in derived class.
	 */
	CpuRamSpec  cpuRamSpec;
	/**
	 * Additional Storage specification, regional, filled in derived class.
	 */
	StorageSpec storageSpec;
	/**
	 * Additional Camera specification, regional, filled in derived class.
	 */
	CameraSpec  cameraSpec;
	/**
	 * Additional Case specification, regional, filled in derived class.
	 */
	CaseSpec    caseSpec;
	
	
	/**
	 * Base phone constructor. Fill base specifications of phone model, without regional specifications
	 * @param ModelName	Model of the phone
	 * @param DisplayName Base display of phone model
	 * @param BatteryName Base battery of phone model
	 * @param CpuRamName  Base cpu and ram of phone model
	 * @param StorageName Base storage of phone model
	 * @param CameraName  Base camera of phone model
	 * @param CaseName    Base case of phone model
	 */
	public Phone(String ModelName, String DisplayName, String BatteryName, String CpuRamName, String StorageName, String CameraName, String CaseName)
	{
		this.ModelName = ModelName;
		this.DisplayName = DisplayName;
		this.BatteryName = BatteryName;
		this.CpuRamName = CpuRamName;
		this.StorageName = StorageName;
		this.CameraName = CameraName;
		this.CaseName = CaseName;
	}
	
	
	/**
	 * This method builds phone, with regional information.
	 * Creates regional specifications and add them to base specifications.
	 * Do these with help of component factory.
	 */
	public abstract void buildPhone();
	
	
	/**
	 * Display attach info message
	 */
	public void attachDisplay()
	{
		System.out.println("Display attached!");
	}
	
	/**
	 * Battery attach info message
	 */
	public void attachBattery()
	{
		System.out.println("Battery attached!");
	}
	
	/**
	 * Cpu and ram attach info message
	 */
	public void attachCPU_RAM()
	{
		System.out.println("Cpu and RAM attached!");
	}
	
	public void attachStorage()
	{
		System.out.println("Storage attached!");
	}
	
	/**
	 * Camera attach info message
	 */
	public void attachCamera()
	{
		System.out.println("Camera attached!");
	}
	
	/**
	 * Case enclose info message
	 */
	public void encloseCase()
	{
		System.out.println("Case enclosed!");
	}
	
	/**
	 *Prints phone specifications with regional additional specifications.
	 */
	public String toString()
	{
		String phone_name = "Model: " + ModelName + "\n";
		phone_name += "Display Specs: " + DisplayName + " and "+ displaySpec.toString() + "\n";
		phone_name += "Battery Specs: " + BatteryName + " " + batterySpec.toString()+ "\n";
		phone_name += "CPU and RAM Specs: " + CpuRamName + " with " +cpuRamSpec.toString()+ "\n";
		phone_name += "Storage Specs: " + StorageName + " " +storageSpec.toString() + " SD card"+ "\n";
		phone_name += "Camera Specs: " +CameraName + " with " + cameraSpec.toString()+ "\n";
		phone_name += "Case Specs: " + CaseName + " " +caseSpec.toString()+ "\n";
		return phone_name;
	}
}
