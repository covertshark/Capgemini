package com.javaassignments.lab6;

import java.util.*;

public class Ex7 
{
	public static int[] getSorted(int[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			StringBuilder st=new StringBuilder();
			String s;
			st.append(array[i]);
			System.out.println(array[i]);
			
			st.reverse();
			
			s=st.toString();
			
			array[i]=Integer.parseInt(s);
			
		}
		System.out.println("------------------after sort--------------------");
		Arrays.sort(array);
		return array;
	}
	
	public static void main(String[] args) {
		int[] myArray = {3,5,2,56,34,23,876,67};
		int[] result = getSorted(myArray);
		for(int i=0; i<myArray.length; i++)
			System.out.println(result[i]);
	}
}
