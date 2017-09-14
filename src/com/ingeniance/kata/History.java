package com.ingeniance.kata;

import java.util.Date;

public class History {
	private String operationType;
	private Date Date;
	private double amount ;
	private Double balance;
	
	
	public History(String operation, double amount, Double balance) {
		this.operationType=operation;
		this.amount = amount;
		this.balance = balance;
		this.Date = new Date();
	}


	public String getOperationType() {
		return operationType;
	}


	public java.util.Date getDate() {
		return Date;
	}


	public double getAmount() {
		return amount;
	}


	public Double getBalance() {
		return balance;
	}


	@Override
	public String toString() {
		return "Operation Type=" + operationType + ", Date=" + Date + ", amount=" + amount + ", balance="
				+ balance;
	}
	
	
}
