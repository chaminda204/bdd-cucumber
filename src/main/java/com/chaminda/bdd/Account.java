package com.chaminda.bdd;

import com.chaminda.bdd.exception.InsufficientFundsException;

public class Account {

	private double balance;

	private double odLimit;

	public double getOdLimit() {
		return odLimit;
	}

	public void setOdLimit(double odLimit) {
		this.odLimit = odLimit;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;

	}

	public void withdraw(double amount) {
		if (balance + odLimit >= amount) {
			balance -= amount;
		} else {
			throw new InsufficientFundsException("Insufficient funds in the account");
		}

	}

}
