package com.javaassignments.day4.ex1;

public class CurrentAccount extends AccountAbstract
{	
	boolean flag  =true;
	double overdraft = -1;
	double bal = getBalance();
	
	public CurrentAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amt) {
		// TODO Auto-generated method stub
//		super.deposit(amt);
		bal += amt;
	}

	@Override
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
//		super.withdraw(amt);
		if(bal - amt<overdraft)
			System.out.println("Amount cannot be withdrwawn overdraft limit reached");
		else
			bal -= amt;
	}
	
}
