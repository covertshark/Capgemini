package com.javaassignments.lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Ex1 {

	public static List<Integer> getValues(HashMap<String, Integer> hmap) {
		
		List<Integer> myList = new ArrayList<Integer>(hmap.values());
		Collections.sort(myList);
		return myList ;
	}
	public static void main(String[] args) {
		
		HashMap<String, Integer> hmap = new HashMap <String, Integer>();
		hmap.put("dara", 23);
		hmap.put("bilu", 43);
		hmap.put("brar", 14);
		System.out.println(getValues(hmap));
	}
}
