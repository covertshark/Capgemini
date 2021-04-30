package com.javaassignments.day5.employee;

public class NameValidation {
	public void employeename(String firstname,String lastname) throws NameException
	{
		try
		{
			if(firstname.isBlank())
				throw new NameException("Names should not be blank");
			if(lastname.isBlank())
				throw new NameException("Names should not be blank");
			else
				System.out.println("Name is fine!!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
