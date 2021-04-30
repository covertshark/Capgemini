package com.javaassignments.day3;

import java.util.*;

public class mirror 
{
	public String getImage(String str)
	{
		StringBuffer st = new StringBuffer(str);
		st.append('|');
		StringBuffer s = new StringBuffer(str);
		s.reverse();
		st.append(s);
		return st.toString();
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		mirror a = new mirror();
		System.out.println("Input string: ");
		Scanner cs = new Scanner(System.in);
		String p = cs.next();
		System.out.println(a.getImage(p));
	}
	
}
