package com.transdb;

/**
 * This class represent an account, with owner name and money amount.
 * @author Furkan Kalabalık
 *
 */
public class BankAccount {
	
	/**
	 *Amount of money in account 
	 */
	private double accountAmount;
	/**
	 * Account owner's name.
	 */
	private String accountOwner;
	
	/**
	 * Constructor for bank account
	 * @param owner Owner name
	 * @param amount Starting amount of account.
	 */
	public BankAccount(String owner, double amount)
	{
		accountAmount = amount;
		accountOwner = owner;
	}
	
	/**
	 * Getter for accountAmount
	 * @return Amount of money in account.
	 */
	public double getAmount()
	{
		return accountAmount;
	}
	
	/**
	 * Setter for accountAmount
	 * @param newAmount Sets account's amount to given amount
	 */
	public void setAmount(double newAmount)
	{
		accountAmount = newAmount;
	}
	
	/**
	 * Shows Account's information in string format.
	 */
	public String toString()
	{
		String str = "\n" + "Account owner: " + accountOwner + "\n";
		str += "Money amount: " + Double.toString(accountAmount) + "\n\n";
		return str;
	}
	
	/**
	 * Alter account's money amount. Add given amount. If given amount is less than zero,
	 * total amount will decrease, otherwise will increase.
	 * @param addAmount Amount of money will be added to account's money
	 */
	public void alterAmount(double addAmount)
	{
		accountAmount += addAmount;
	}
	
	/**
	 * Get's account information by printing to screen. 
	 */
	public void getBankAccount()
	{
		System.out.print(this.toString());
	}
	
	/**
	 * Setter for account owner's name
	 * @param newOwner New owner name
	 */
	public void setOwner(String newOwner)
	{
		this.accountOwner = newOwner;
	}
}
