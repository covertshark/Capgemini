package com.javaassignments.day4.ex1;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person smith = new Person("smith", 22);
		Person kathy = new Person("kathy", 21);
		
		AtomicInteger count = new AtomicInteger(0);
		Account smithaccount = new Account(count.incrementAndGet(),2000,smith);
		Account kathyaccount = new Account(count.incrementAndGet(),3000,kathy);

		System.out.println(smithaccount);
		System.out.println(kathyaccount);
		
		smithaccount.deposit(2000);
		kathyaccount.withdraw(3000);
		
		System.out.println("Smith's account Balance");
		smithaccount.getBalance();
		System.out.println("Kathy's account Balance");
		kathyaccount.getBalance();
	}

}
