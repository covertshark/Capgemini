package com.javaassignments.day3;

import java.time.*;

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date1 = LocalDate.of(2017, 4, 12);
		LocalDate date2 = LocalDate.now();
		
		System.out.println("Date 1:"+date1);
		System.out.println("Date 2:"+date2+"\n");
		
		Period p = Period.between(date1, date2);
		
		System.out.println("Years(Difference): "+p.getYears());
		System.out.println("Months(Difference): "+p.getMonths());
		System.out.println("Days(Difference): "+p.getDays());

	}

}
