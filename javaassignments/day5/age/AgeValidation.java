package com.javaassignments.day5.age;

public class AgeValidation 
{
	public void validate(int age) throws AgeException
	{
		try
		{
			if(age<=15)
				throw new AgeException(" Age of a person should be above 15!!");
			else
				System.out.println("Age is fine!!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
