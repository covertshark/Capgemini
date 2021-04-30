package com.javaassignments.day3;

import java.util.*;

public class OrderString {
	
	static boolean AlphabeticOrder(String s)
	{
		int n = s.length();
		char c[] = new char[n];
		
		for (int i = 0; i<n; i++)
			c[i] = s.charAt(i);
		Arrays.sort(c);
		
		for (int i = 0; i<n; i++)
			if (c[i] != s.charAt(i))
				return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter a string: ");
		Scanner cs = new Scanner(System.in);
		String s = cs.nextLine();
//		String s = "sta";
		
		if(AlphabeticOrder(s))
			System.out.println("True");
		else
			System.out.println("False");

	}

}
