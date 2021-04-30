package com.javaassignments.lab9;

interface Auth {
	public boolean authUser(String username, String password);
}

public class Ex3 
{
	public static void main(String[] args) 
	{
		String username = "Mohit";
		String password = "Sahni";

		Auth at = (user, pwd) -> {
			if (user.equals(username) && pwd.equals(password))
				return true;
			return false;
		};
		System.out.println(at.authUser("Mohit", "Sahni"));

	}
}