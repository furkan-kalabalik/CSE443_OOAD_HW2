package com.transdb;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * This is Transaction Class. This class is container for multiple commands.
 * A Transaction is a chain of commands. This class takes commands in a queue,
 * then when it's fired, poll every command from queue, fire their execute method,
 * then put command to transaction history, which is a stack. In case of any error in
 * the transaction command chain, this stack will be used to undo.
 * @author Furkan Kalabalık
 *
 */
public class Transaction {
	/**
	 * Every transaction will have unique id
	 */
	private static int id_generate = 0;
	/**
	 * Transaction id
	 */
	private int transaction_id;
	/**
	 * Commands will be placed in this queue.
	 */
	private Queue<Command> commandQueue;
	/**
	 * Completed commands will be in this stack.
	 */
	private Stack<Command> commandHistory;
	
	/**
	 * This constructor takes a list of commands, adds them to transaction queue and creates transaction object.
	 * @param commandList Commands that will be added to queue.
	 */
	public Transaction(List<Command> commandList)
	{
		transaction_id = id_generate++;
		commandQueue = new LinkedList<Command>();
		commandHistory = new Stack<Command>();
		
		for(Command command: commandList)
			commandQueue.add(command);
		System.out.printf("Transaction-%d created!\n", transaction_id);
	}
	
	/**
	 * Creates transaction and give it a unique id.
	 */
	public Transaction()
	{
		transaction_id = id_generate++;
		commandQueue = new LinkedList<Command>();
		commandHistory = new Stack<Command>();
		System.out.printf("Transaction-%d created!\n", transaction_id);
	}
	
	/**
	 * Add command to queue.
	 * @param command Command will be added to queue.
	 */
	public void addCommand(Command command)
	{
		commandQueue.add(command);
	}
	
	/**
	 * Remove command from queue if it exist in queue.
	 * @param command Command will be deleted from queue.
	 */
	public void removeCommand(Command command)
	{
		commandQueue.remove(command);
	}
	
	/**
	 * This method fires the transaction. Perform commands in order until there is no command in queue.
	 * Takes return of every command. If any of fails, using commandHistory, undo every previous
	 * completed command. If there isn't any failed command, prints result.
	 */
	public void doTransaction()
	{
		System.out.printf("\nTransaction-%d is processing!\n\n", transaction_id);
		boolean isSucceed = true;
		Command current_command = null;
		while(!commandQueue.isEmpty())
		{
			current_command = commandQueue.poll();
			isSucceed = current_command.execute();
			if(!isSucceed)
				break;
			commandHistory.push(current_command);
		}
		
		if(!isSucceed)
		{
			System.out.printf("Transaction-%d couldn't be completed. Undoing previously completed operations!\n\n", transaction_id);
			while(!commandHistory.isEmpty())
			{
				current_command = commandHistory.pop();
				current_command.undo();
			}
		}
		else
		{
			System.out.printf("Transaction-%d is completed succesfully!\n\n", transaction_id);
		}
	}
}
