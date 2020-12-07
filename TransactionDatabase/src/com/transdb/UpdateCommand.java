package com.transdb;

import java.util.List;

/**
 * This is the update command. Set money amount of given account.
 * @author Furkan Kalabalık
 *
 */
public class UpdateCommand implements Command {
	/**
	 * Bank account to command performed on
	 */
	private BankAccount bankAccount;
	/**
	 * Update amount on account. This will be set.
	 */
	private double updateAmount;
	/**
	 * Database to check is bank account belongs to our bank database.
	 */
	private List<BankAccount> bankDatabase;
	
	/**
	 * To hold previous money amount if an error occurs during transaction. 
	 */
	private double previousAmount;
	
	/**
	 * This is the constructor that takes bank account and bank database with amount that will used to set 
	 * account's money amount .
	 * @param bankDatabase Bank database
	 * @param bankAccount Bank account that operation will perform on.
	 * @param updateAmount Set money amount.
	 */
	public UpdateCommand(List<BankAccount> bankDatabase, BankAccount bankAccount, double updateAmount)
	{
		this.bankDatabase = bankDatabase; 
		this.bankAccount = bankAccount;
		this.updateAmount = updateAmount;
	}
	
	/**
	 * Execute command is implemented from Command interface.
	 * With that method we guarantee that this is a command and it do something.
	 * UPDATE command will perform set operation on account's money, if account exist in database and return true
	 * otherwise return false.
	 * 
	 * Also checks if update decreases amount of money under 0, consider that as fail and undo operation and
	 * return false to rollback transaction.
	 */
	@Override
	public boolean execute() {
		System.out.println("UPDATE");
		if(bankDatabase.contains(bankAccount))
		{
			previousAmount = bankAccount.getAmount();
			bankAccount.setAmount(updateAmount);
		}
		else
		{
			System.out.println("Bank Account is not in database. Couldn't be retrieved\n");
			return false;
		}
		
		if(bankAccount.getAmount() < 0)
		{
			this.undo();
			return false;
		}
		else
			return true;
	}
	
	/**
	 * Using previous amount, set money amount to previous amount.
	 */
	@Override
	public void undo() {
		System.out.println("Undoing update\n");
		bankAccount.setAmount(previousAmount);
	}

}
