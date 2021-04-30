package com.javaassignments.day4.ex1;

public class SavingsAccount extends AccountAbstract
{
	final double minbal = 500;
	double bal = getBalance();
	
	public SavingsAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amt) {
		// TODO Auto-generated method stub
//		super.deposit(amt);
		bal += amt;
		System.out.println("Updated Balance: "+bal);
	}

	@Override
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
//		super.withdraw(amt);
		if(bal - amt<minbal)
			System.out.println("Amount cannot be withdrwawn min balance issue.");
		else
			bal -= amt;
	}
	
	
}
