package com.javaassignments.lab6;

import java.util.*;

public class Ex5 
{
	public static int getSecondSmallest(int[] a) 
	{
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i< a.length; i++)
			myList.add(a[i]);
	
		Collections.sort(myList);
		return myList.get(1);
	}
	public static void main(String[] args) {
		
		int[] myList = {4,5,3,2,8,7,9};
		System.out.println(getSecondSmallest(myList));
	}

}
