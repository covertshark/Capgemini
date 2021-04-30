package com.javaassignments.day4;
import java.util.*;

public class MediaItem extends Item
{
	private int runtime;

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	Scanner cs = new Scanner(System.in);
	
	public MediaItem()
	{
		super();
		System.out.println("Enter video runtime: ");
		setRuntime(cs.nextInt());
	}
	void print()
	{
		super.print();
		System.out.println("Video Runtime is: "+getRuntime());
	}
}
