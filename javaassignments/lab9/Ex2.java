package com.javaassignments.lab9;

public class Ex2 
{
	public static void main(String[] args) {
		
		StringSpacer sp = str -> {
			char[] array = str.toCharArray();
			String result = "";
			for(int i=0; i<array.length; i++)
				result = result+array[i]+" ";
			return result;
		};
		System.out.println(sp.giveMeSpace("MOHIT"));
	}
}

interface StringSpacer 
{
	public String giveMeSpace(String line);
}