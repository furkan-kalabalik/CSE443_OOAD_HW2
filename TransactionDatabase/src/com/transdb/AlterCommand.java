package com.transdb;

import java.util.List;

/**
 * This is the alter command. Perform an addition or subtraction,
 * from given bank account. 
 * @author Furkan Kalabalık
 *
 */
public class AlterCommand implements Command {
	
	/**
	 * Bank account to command performed on
	 */
	private BankAccount bankAccount;
	/**
	 * How much money will be added or removed. Sign of amount determine addition or subtraction.
	 */
	private double alterAmount;
	/**
	 * Database to check is bank account belongs to our bank database.
	 */
	private List<BankAccount> bankDatabase;
	
	/**
	 * This is the constructor that takes bank account and bank database with amount that will used to change 
	 * account's money amount.
	 * @param bankDatabase Bank database
	 * @param bankAccount Bank account that operation will perform on.
	 * @param alterAmount How much money will be removed or added.
	 */
	public AlterCommand(List<BankAccount> bankDatabase, BankAccount bankAccount, double alterAmount)
	{
		this.bankDatabase = bankDatabase; 
		this.bankAccount = bankAccount;
		this.alterAmount = alterAmount;
	}
	
	/**
	 * Execute command is implemented from Command interface.
	 * With that method we guarantee that this is a command and it do something.
	 * ALTER command will perform amount change on account, if account exist in database and return true
	 * otherwise return false.
	 * 
	 * Also checks if alteration decreases amount of money under 0, consider that as fail and undo operation and
	 * return false to rollback transaction.
	 */
	@Override
	public boolean execute() {
		System.out.println("ALTER");
		if(bankDatabase.contains(bankAccount))
		{
			bankAccount.alterAmount(alterAmount);
		}
		else
		{
			System.out.println("\nBank Account is not in database. Couldn't be retrieved\n");
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
	 *Undo makes opposite of performed alteration.
	 */
	@Override
	public void undo() {
		System.out.println("Undoing alter\n");
		bankAccount.alterAmount((-1)*alterAmount);
	}

}
