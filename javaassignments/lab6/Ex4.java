package com.javaassignments.lab6;

import java.util.*;

public class Ex4 
{
	
	public static HashMap<String, String> getStudents(HashMap<String, Integer> hmap)
	{
		HashMap<String, String> res = new HashMap<>();
		for(Map.Entry<String, Integer> entry : hmap.entrySet())
		{
			if(entry.getValue() >= 90)
				res.put(entry.getKey(), "GOLD");
			else if(entry.getValue() >= 80 && entry.getValue() < 90)
				res.put(entry.getKey(), "SILVER");
			else if(entry.getValue() >= 70 && entry.getValue() < 90)
				res.put(entry.getKey(), "BRONZE");
		}
		return res;
	}
	
	public static void main(String[] args) 
	{
		HashMap<String, Integer> marks = new HashMap<>();
		marks.put("eig113dt", 91);
		marks.put("eig124srt", 90);
		marks.put("eig135s", 55);
		marks.put("eig146drg", 80);
		
		HashMap<String, String> result = getStudents(marks);
		System.out.println(result);
	}

}
