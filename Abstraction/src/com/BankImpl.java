package com;

class BankImpl implements Bank {

	int balance = 5000;
	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs."+amount);
		balance += amount; 
		System.out.println("Amount depositing Sucessfully.");
	}
	@Override
	public void withdraw(int amount) {
		System.out.println("Withdrawing Rs."+amount);
		balance -= amount; 
		System.out.println("Amount withdrawting Sucessfully.");
	}
	@Override
	public void checkBalence() {
		System.out.println("Balance Amount Rs."+balance);

	}

	

}
