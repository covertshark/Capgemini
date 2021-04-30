package com.javaassignments.day4;
import java.util.*;

public abstract class Item 
{
	private int idNo;
	private int copy;
	private String title;
	public Item(int idNo, int copy, String title)
	{
		this.idNo = idNo;
		this.copy = copy;
		this.title = title;
	}
	public int getIdNo() {
		return idNo;
	}
	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}
	public int getCopy() {
		return copy;
	}
	public void setCopy(int copy) {
		this.copy = copy;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Item()
	{
		Scanner cs=new Scanner(System.in);
		System.out.println("Enter the id number:");
		setIdNo(cs.nextInt());
		System.out.println("Enter title:");
		setTitle(cs.next());
		System.out.println("Enter number of copies:");
		setCopy(cs.nextInt());
		cs.close();
	}
	void print()
	{
		System.out.println("id:"+getIdNo()+"\n"
						+"title:"+getTitle()+"\n"
						+"copy:"+getCopy()+"\n");
	}
}
