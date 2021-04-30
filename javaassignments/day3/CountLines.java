package com.javaassignments.day3;
import java.util.*;

public class CountLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 1;
		int nw =0;
		System.out.println("Enter new String: ");
		Scanner cs = new Scanner(System.in);
		String str = cs.nextLine();
		int n = str.length();
		for(int i=0; i<n;i++)
		{
			char ch = str.charAt(i);
			if(ch =='\n')
				n1++;
			else if(ch==' ')
				nw++;
		}
		System.out.println("\nNumber of lines: "+n1);
		System.out.println("\nNumber of words: "+(n1+nw));
		System.out.println("\nNumber of charecters: "+n);

	}

}
