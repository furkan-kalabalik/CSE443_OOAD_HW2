package com.transdb;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * This is the main transaction system. This class fires all transactions,
 * in its queue. Firing commands starts from there.
 * @author Furkan Kalabalık
 *
 */
public class TransactionSystem {
	
	/**
	 * Queue for transactions.
	 */
	private Queue<Transaction> transactionQueue;
	
	/**
	 * This is the constructor for TransactionSystem. This constructor takes
	 * list of transactions and add them to transactionQueue.
	 * @param transactionList transaction that will be added to queue.
	 */
	public TransactionSystem(List<Transaction> transactionList)
	{
		transactionQueue = new LinkedList<Transaction>();
		for(Transaction transaction: transactionList)
			transactionQueue.add(transaction);
		System.out.println("Transaction system created!");
	}
	
	/**
	 * This constructor creates a single TransactionSystem
	 */
	public TransactionSystem()
	{
		transactionQueue = new LinkedList<Transaction>();
		System.out.println("Transaction system created!");
	}
	
	/**
	 * Add one transaction to the transactionQueue
	 * @param transaction Transaction will be added to transactionQueue
	 */
	public void addTransaction(Transaction transaction)
	{
		transactionQueue.add(transaction);
	}
	
	/**
	 * Removes one transaction from the transactionQueue, if exist
	 * @param transaction Transaction will be removed to transactionQueue
	 */
	public void removeTransaction(Transaction transaction)
	{
		transactionQueue.remove(transaction);
	}
	
	/**
	 * This method fires transactions in transactionQueue and removes them from transactionQueue, if any.
	 * After firing transaction, transaction fires its commands and command is performed.
	 */
	public void executePendingTransactions()
	{
		while(!transactionQueue.isEmpty())
			transactionQueue.poll().doTransaction();
	}
}
