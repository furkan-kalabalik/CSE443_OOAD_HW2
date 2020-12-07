package com.transdb;

import java.util.ArrayList;

/**
 * Driver method for testing classes.
 * @author Furkan Kalabalık
 *
 */
public class Driver {

	/**
	 * Main method
	 * @param args command line arguments if any
	 */
	public static void main(String[] args) {
		TransactionSystem transactionSystem = new TransactionSystem();
		ArrayList<BankAccount> bankDatabase = new ArrayList<BankAccount>();
		BankAccount account1 = new BankAccount("Michael Scott", 120);
		BankAccount account2 = new BankAccount("Dwight Schrute", 300);
		BankAccount account3 = new BankAccount("Jim Harpert", 250);
		bankDatabase.add(account1);
		bankDatabase.add(account2);
		
		Transaction transaction1 = new Transaction();
		transaction1.addCommand(new SelectCommand(bankDatabase, account1));
		transaction1.addCommand(new AlterCommand(bankDatabase, account2, -20));
		transaction1.addCommand(new SelectCommand(bankDatabase, account2));
		transaction1.addCommand(new UpdateCommand(bankDatabase, account1, 150));
		transaction1.addCommand(new SelectCommand(bankDatabase, account1));
	
		transactionSystem.addTransaction(transaction1);
		
		Transaction transaction2 = new Transaction();
		transaction2.addCommand(new UpdateCommand(bankDatabase, account2, 200));
		transaction2.addCommand(new SelectCommand(bankDatabase, account2));
		transaction2.addCommand(new AlterCommand(bankDatabase, account1, 40));
		transaction2.addCommand(new SelectCommand(bankDatabase, account1));
		transaction2.addCommand(new UpdateCommand(bankDatabase, account3, 1000));
		transaction2.addCommand(new SelectCommand(bankDatabase, account3));
		
		transactionSystem.addTransaction(transaction2);
		
		Transaction transaction3 = new Transaction();
		transaction3.addCommand(new SelectCommand(bankDatabase, account1));
		transaction3.addCommand(new SelectCommand(bankDatabase, account2));
		
		transactionSystem.addTransaction(transaction3);
		
		System.out.println("\nStarting processing transactions.\n");
		transactionSystem.executePendingTransactions();
	}

}
