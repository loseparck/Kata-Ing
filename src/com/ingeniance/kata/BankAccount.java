package com.ingeniance.kata;

import java.util.List;
import java.util.Vector;

public class BankAccount {
	Double balance;
	private List<History> history;
	
	public BankAccount() {
		this(0);
	}
	
	public BankAccount(double balance) {
		this.balance = balance;
		this.history = new Vector<>();
	}
	
	public void deposite(double amount) {
		synchronized (balance) {
			balance += amount;
			history.add(new History("Deposit", amount, balance));
		}
	}
	
	public void withdrawal(double amount) {
		synchronized (balance) {
			if(balance >= amount) {
				balance -= amount;
				history.add(new History("Withdrawal", amount, balance));
			}
			else {
				System.err.println("Withdrawal Echec, no solde !");
			}
		}
	}
	
	public void history() {
		for (History operation : history) {
			System.out.println(operation);
		}
	}
}
