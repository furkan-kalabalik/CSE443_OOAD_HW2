package com.transdb;

import java.util.List;

/**
 * This is the select command. Retrieves account from bank database.
 * @author Furkan Kalabalık
 *
 */
public class SelectCommand implements Command {
	/**
	 * Bank account to command performed on
	 */
	private BankAccount bankAccount;
	/**
	 * Database to check is bank account belongs to our bank database.
	 */
	private List<BankAccount> bankDatabase;
	
	/**
	 * This is the constructor that takes bank account and bank database to check whether account is in DB or not.
	 * @param bankDatabase Bank database
	 * @param bankAccount Bank account that operation will perform on.
	 */
	public SelectCommand(List<BankAccount> bankDatabase, BankAccount bankAccount)
	{
		this.bankAccount = bankAccount;
		this.bankDatabase = bankDatabase;
	}
	
	/**
	 * Execute command is implemented from Command interface.
	 * With that method we guarantee that this is a command and it do something.
	 * SELECT command will perform retrieve operation and checks whether account is in bankDatabase or not.
	 * If it is in bankDatabase, show Account's information and return true. Otherwise, print error message and return false.
	 * 
	 * 
	 */
	@Override
	public boolean execute() {
		System.out.println("SELECT");
		if(bankDatabase.contains(bankAccount))
		{	
			bankAccount.getBankAccount();
			return true;
		}
		else
		{
			System.out.println("Bank Account is not in database. Couldn't be retrieved\n");
			return false;
		}
	}
	
	
	/**
	 * Undoing selection.
	 */
	@Override
	public void undo() {
		System.out.println("Undoing select\n");
	}

}
