package com.javaassignments.day4;
import java.util.*;

public class Journal extends WrittenItem
{
	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	Scanner cs = new Scanner(System.in);
	public Journal()
	{
		super();
		System.out.println("Enter the year of publish: ");
		setYear(cs.nextInt());
	}
	public void print()
	{
		super.print();
		System.out.println("Year of publish is: "+getYear());
	}
}
