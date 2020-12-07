package com.iflas;

/**
 * This class implements PhoneComponentFactory interface.
 * It creates regional components for EU Market.
 * @author Furkan Kalabalık
 *
 */
public class EuComponentFactory implements PhoneComponentFactory {
	
	/**
	 *Creates 24 bit display for EU market phones.
	 */
	@Override
	public DisplaySpec createDisplaySpec() {
		System.out.println("24 bit display will be placed!");
		return new Bit24Display();
	}
	
	/**
	 *Creates Ion Battery for EU market phones.
	 */
	@Override
	public BatterySpec createBatterySpec() {
		System.out.println("Battery will be ion!");
		return new BatteryIon();
	}
	
	/**
	 *Creates 4 Core Cpu for EU market phones.
	 */
	@Override
	public CpuRamSpec createCpuRamSpec() {
		System.out.println("Cpu will have 4 core!");
		return new Core4();
	}
	
	/**
	 *Creates max 64GB sd card support for EU market phones.
	 */
	@Override
	public StorageSpec createStorageSpec() {
		System.out.println("Phone will support SD Card up to 64GB");
		return new Max64();
	}
	
	/**
	 *Creates x3 zoom optic for EU market phones.
	 */
	@Override
	public CameraSpec createCameraSpec() {
		System.out.println("Camera will have x3 optic zoom");
		return new ZoomX3();
	}
	
	/**
	 *Creates Waterproof case up to 1m for EU market phones.
	 */
	@Override
	public CaseSpec createCaseSpec() {
		System.out.println("Case will be waterproof up to 1m");
		return new WaterUpTo1m();
	}

}
