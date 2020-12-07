package com.iflas;


/**
 * This is the interface for Phone Component Factories. This
 * interface guarantees that every factory are implemented these
 * methods for regional specification of phone model.
 * @author Furkan Kalabalık
 *
 */
public interface PhoneComponentFactory {
	
	/**
	 * Returns a regional display specification according to market region.
	 * @return Returns a regional display specification.
	 */
	public DisplaySpec createDisplaySpec();
	/**
	 * Returns a regional battery specification according to market region.
	 * @return Returns a regional battery specification.
	 */
	public BatterySpec createBatterySpec();
	/**
	 * Returns a regional Cpu and Ram specification according to market region.
	 * @return Returns a regional Cpu and Ram specification.
	 */
	public CpuRamSpec createCpuRamSpec();
	/**
	 * Returns a regional storage specification according to market region.
	 * @return Returns a regional storage specification.
	 */
	public StorageSpec createStorageSpec();
	/**
	 * Returns a regional camera specification according to market region.
	 * @return Returns a regional camera specification.
	 */
	public CameraSpec createCameraSpec();
	/**
	 * Returns a regional case specification according to market region.
	 * @return Returns a regional case specification.
	 */
	public CaseSpec createCaseSpec();
}
