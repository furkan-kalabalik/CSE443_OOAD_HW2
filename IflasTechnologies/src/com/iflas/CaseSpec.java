package com.iflas;

/**
 * Interface for Regional Case specifications.
 * It implements toString method for specify, waterproof
 * depth limit.
 * @author Furkan Kalabalık
 *
 */
public interface CaseSpec {
	
	/**
	 * Generates waterproof depth limit specification.
	 * @return waterproof depth limit in string
	 */
	public String toString();
}
