package com.javaassignments.lab9;
import java.util.*;

public class Ex5 
{
	public static int fact(int a)
	{
		int fact =1;
		while(a>0)
		{
			fact *= a;
			a--;
		}
		return fact;
	}
	public static void main(String[] args) {
		
		Scanner cs = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = cs.nextInt();
		
		Factorial fc = Ex5::fact;
        System.out.println("Factorial of "+(num)+" is: "+fc.factorial(num));
	}
}

interface Factorial
{
	public int factorial (int a);
}