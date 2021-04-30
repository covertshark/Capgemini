package com.javaassignments.lab6;
import java.util.*;

public class Ex2 {

	public static Map<Character, Integer> countChars(char[] arr) {

		Map<Character, Integer> myMap = new HashMap<>();
		for (char c : arr) {
			if (myMap.containsKey(c)) {
				int count = myMap.get(c);
				myMap.put(c, count + 1);

			} else {
				myMap.put(c, 1);
			}
		}
		return myMap;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character array: ");
		String str = sc.next();
		System.out.println(countChars(str.toCharArray()));
	}
}
