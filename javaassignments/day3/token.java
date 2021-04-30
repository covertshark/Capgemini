package com.javaassignments.day3;


import java.util.*;

public class token 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int sum=0;
		
		Scanner cs = new Scanner(System.in);
		System.out.println("Input Integers: ");
		String s = cs.nextLine();
		StringTokenizer a=new StringTokenizer(s," ");
		
		while(a.hasMoreTokens())
		{
			int n = Integer.parseInt(a.nextToken());
			sum=sum+n;
			System.out.println(" "+n);
		}
		System.out.println("sum is "+sum);
	}
}
