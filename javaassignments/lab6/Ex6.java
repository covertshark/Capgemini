package com.javaassignments.lab6;

import java.util.*;
import java.time.*;


public class Ex6 
{
	public static ArrayList<String> isEligible(HashMap<String, LocalDate> hm) {
		// TODO Auto-generated method stub
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		ArrayList<String> arr=new ArrayList<String>();
		
		while (i.hasNext()) {
			Map.Entry ag = (Map.Entry) i.next();
		
		LocalDate myObj = LocalDate.now();
	    Period intervalPeriod = Period.between((LocalDate) ag.getValue(), myObj);
	    if(intervalPeriod.getYears()>18)
	    	arr.add((String) ag.getKey());
	}
	return arr;
}
 
	public static void main(String ar[])
	{
        HashMap<String, LocalDate> hm = new HashMap<String, LocalDate>(); 
        hm.put("sumit", LocalDate.of(2002,11,06));
        hm.put("raghav", LocalDate.of(2001,11,06));
        ArrayList<String> hm1= isEligible(hm); 
        
        // print the sorted hashmap 
        for(String elem : hm1){
            System.out.println(elem+"  ");
        }
	}
}
