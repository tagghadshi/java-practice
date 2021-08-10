package com.tcs.entity;

public class StaticDemo {
	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println(Bank.createNewAccounts());
		System.out.println(Bank.createNewAccounts());
		System.out.println(bank.instanceVariable);
		
		Bank bank1 = new Bank();
		System.out.println(bank1.createNewAccounts());
		System.out.println(bank1.createNewAccounts());
		System.out.println(bank1.instanceVariable);
	}
}

class Bank {
	static int counter;
	int instanceVariable =10; //instanceVariable
	public static int createNewAccounts(){
		return ++counter;
	}
}