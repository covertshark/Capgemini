package com.javaassignments.day4;
import java.util.*;

public class WrittenItem extends Item 
{
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	Scanner cs = new Scanner(System.in);
	
	public WrittenItem()
	{
		super();
		System.out.println("Enter author name: ");
		setAuthor(cs.next());
	}
	
	public WrittenItem(int idNo, int copy, String title, String author)
	{
		super(idNo, copy, title);
		setAuthor(author);
	}
	
	public void print()
	{
		super.print();
		System.out.println("Author's name is: "+getAuthor());
	}
}
