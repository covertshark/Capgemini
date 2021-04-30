package com.javaassignments.lab9;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
    	
    	Scanner cs=new Scanner(System.in);
    	System.out.println("Enter the Name1 : ");
    	String name1=cs.next();
        Name name=new Name(name1);
        System.out.println("Enter the Name2 to Compare : ");
    	String name2=cs.next();
        ISameName check=name::isSame;
        boolean result=check.isSame(name2);
        if(result) {
        	System.out.println("Both Names are Same");
        }else {
        	System.out.println("Both are Different Names");
        }
        cs.close();
    }
}




