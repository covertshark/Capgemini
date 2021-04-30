package com.javaassignments.day4.ex1;

public class AccountAbstract {
	private long accNum;
	private double balance;
	private Person accHolder;

	public AccountAbstract(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	
	/**
	 * @return the accNum
	 */
	public long getAccNum() {
		return accNum;
	}
	
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	
	public Person getAccHolder() {
		return accHolder;
	}
	
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount){
		balance+=amount;
	}
	public void withdraw(double amount){
		balance-=amount;
	}
	public void getaccountBalance(){
		System.out.println(balance);
	}
	
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance
				+ ", accHolder=" + accHolder + "]";
	}
	
}
