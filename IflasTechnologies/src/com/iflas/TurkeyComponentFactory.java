package com.iflas;


/**
 * This class implements PhoneComponentFactory interface.
 * It creates regional components for Turkey Market.
 * @author Furkan Kalabalık
 *
 */
public class TurkeyComponentFactory implements PhoneComponentFactory {

	/**
	 *Creates 32 bit display for Turkey market phones.
	 */
	@Override
	public DisplaySpec createDisplaySpec() {
		System.out.println("32 bit display will be placed!");
		return new Bit32Display();
	}
	
	/**
	 *Creates Boron Battery for Turkey market phones.
	 */
	@Override
	public BatterySpec createBatterySpec() {
		System.out.println("Battery will be boron!");
		return new BatteryBoron();
	}
	
	/**
	 *Creates 8 Core Cpu for Turkey market phones.
	 */
	@Override
	public CpuRamSpec createCpuRamSpec() {
		System.out.println("Cpu will have 8 core!");
		return new Core8();
	}
	
	/**
	 *Creates max 128GB sd card support for Turkey market phones.
	 */
	@Override
	public StorageSpec createStorageSpec() {
		System.out.println("Phone will support SD Card up to 128GB");
		return new Max128();
	}
	
	/**
	 *Creates x4 zoom optic for Turkey market phones.
	 */
	@Override
	public CameraSpec createCameraSpec() {
		System.out.println("Camera will have x2 optic zoom");
		return new ZoomX4();
	}
	
	/**
	 *Creates Waterproof case up to 2m for Turkey market phones.
	 */
	@Override
	public CaseSpec createCaseSpec() {
		System.out.println("Case will be waterproof up to 2m");
		return new WaterUpTo2m();
	}
}
