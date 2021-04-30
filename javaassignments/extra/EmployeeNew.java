package com.javaassignments.extra;

import com.java.employee.model.*;

import java.util.*;

public class EmployeeNew {

	public static void main(String args[])
	{
		    List<Employee> emp = new ArrayList<Employee>(); 
		    
			emp.add(new Employee(1002, "emp2", 200000.00, "12-12-2020"));
		    emp.add(new Employee(1001, "emp1", 100000.00, "11-12-2020"));
			emp.add(new Employee(1005, "emp5", 500000.00, "15-12-2020"));
			emp.add(new Employee(1003, "emp3", 300000.00, "13-12-2020"));
			emp.add(new Employee(1006, "emp6", 600000.00, "16-12-2020"));
			emp.add(new Employee(1004, "emp4", 400000.00, "14-12-2020"));
			emp.add(new Employee(1005, "employee5", 500000.00, "15-12-2020"));
			
			for(Employee e: emp)
				System.out.println(e+"\n");
			
			System.out.println("\n*****TreeSet**********\n");
			
			TreeSet<Employee> newemp = new TreeSet<Employee>(emp);
//			HashSet<Employee> set = new HashSet<Employee> (emp);
			
//			System.out.println(newemp);
			
			for(Employee i : newemp)
				System.out.println(i+"\n");
	}
}
