package com.javaassignments.day5.employee;
import java.util.*;


public class Main {
	static  String firstname;
	static String lastname;

	public static void main(String[] args) throws NameException {
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter the first name");
		firstname = cs.nextLine();
		System.out.println("Enter the last name");
		lastname = cs.nextLine();
		NameValidation v = new NameValidation();
		v.employeename(firstname, lastname);
		cs.close();	
	}

}
