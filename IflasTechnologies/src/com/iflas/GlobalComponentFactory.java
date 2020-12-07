package com.iflas;

/**
 * This class implements PhoneComponentFactory interface.
 * It creates regional components for Global Market.
 * @author Furkan Kalabalık
 *
 */
public class GlobalComponentFactory implements PhoneComponentFactory {
	
	/**
	 *Creates 24 bit display for Global market phones.
	 */
	@Override
	public DisplaySpec createDisplaySpec() {
		System.out.println("24 bit display will be placed!");
		return new Bit24Display();
	}
	
	/**
	 *Creates Cobalt Battery for Global market phones.
	 */
	@Override
	public BatterySpec createBatterySpec() {
		System.out.println("Battery will be cobalt!");
		return new BatteryCobalt();
	}
	
	/**
	 *Creates 2 Core Cpu for Global market phones.
	 */
	@Override
	public CpuRamSpec createCpuRamSpec() {
		System.out.println("Cpu will have 2 core!");
		return new Core2();
	}
	
	/**
	 *Creates max 32GB sd card support for Global market phones.
	 */
	@Override
	public StorageSpec createStorageSpec() {
		System.out.println("Phone will support SD Card up to 32GB");
		return new Max32();
	}
	
	/**
	 *Creates x2 zoom optic for Global market phones.
	 */
	@Override
	public CameraSpec createCameraSpec() {
		System.out.println("Camera will have x2 optic zoom");
		return new ZoomX2();
	}
	
	/**
	 *Creates Waterproof case up to 50cm for Global market phones.
	 */
	@Override
	public CaseSpec createCaseSpec() {
		System.out.println("Case will be waterproof up to 50cm");
		return new WaterUpTo50cm();
	}

}
