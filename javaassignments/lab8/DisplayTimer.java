package com.javaassignments.lab8;

import java.time.*;

public class DisplayTimer implements Runnable{
	public void run() 
	{
		while(true) 
		{
			LocalTime lt = LocalTime.now();
			System.out.println(lt);
			try 
			{
				Thread.sleep(10000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String s[]) throws InterruptedException{
		DisplayTimer dt = new DisplayTimer();
		Thread t=new Thread(dt);
		t.start();	
	}
}