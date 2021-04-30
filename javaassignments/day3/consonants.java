package com.javaassignments.day3;

public class consonants {
	
	private static final String CONSONANTS = "bcdfghjklmnpqrstvwxyz";
	
	private static String alterString(String input)
	{
		char[] chars = input.toLowerCase().toCharArray();
		for (int i = 0; i< chars.length; i++)
		{
			int idx = CONSONANTS.indexOf(chars[i]);
			if(idx != -1)
			{
				chars[i] = CONSONANTS.charAt((idx + 1) % CONSONANTS.length());
			}
		}
		return new String(chars);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(alterString("tripling").toUpperCase());
		

	}
}