package com.transdb;

/**
 * This is Command interface. Every Command must implement that interface
 * to called by its Invoker.
 * @author Furkan kalabalık
 *
 */
public interface Command {
	
	/**
	 * This command will perform exact action of command.
	 * @return In case of success returns true, otherwise false
	 */
	boolean execute();
	
	/**
	 * This function perform undo operation for particular command.
	 * This will be used if there is any error in transcation. 
	 */
	void undo();
}
