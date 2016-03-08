package com.testproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestingListInterface {

	public static void main(String[] args) {

		List<String> mylist = new ArrayList<>();

		for (int i = 1; i < 10; i++) {
			mylist.add("this is a sample string" + i);
			mylist.add("Hello world");
		}
		Collections.sort(mylist);
		System.out.println(mylist);

		/*
		 * for(Integer myl:mylist){ System.out.println(myl); }
		 */

		/*
		 * Iterator<String>iterator=mylist.iterator();
		 * while(iterator.hasNext()){ System.out.println(iterator.next()); }
		 */

		/*
		 * if(mylist.contains("Hello world")){ System.out.println(
		 * "Found the Hello World Text"); } else{ System.out.println(
		 * "didn't found the Hello World Text");
		 * 
		 * }
		 */

		List<String> listStrings = new ArrayList<String>();
		listStrings.add("D");
		listStrings.add("C");
		listStrings.add("E");
		listStrings.add("A");
		listStrings.add("B");

		System.out.println("listStrings before sorting: " + listStrings);

		Collections.sort(listStrings);

		System.out.println("listStrings after sorting: " + listStrings);

		int indexofBinary = Collections.binarySearch(listStrings, "D", null);
		System.out.println("The Result of our Binary Search shows your value is found at index : " + indexofBinary);

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(2928, "Hussain"));

		List<Students> students = new ArrayList<>();
		students.add(new Students(233, "Girma"));

		try {
			int k = Integer.parseInt("4b4");
			System.out.println("the value of k is :" + k);
			
		} catch (NumberFormatException	 e) {
			System.out.println("This is the err message"+e.getMessage());
			//e.printStackTrace();
		}
		
		
	}

}

class Employee {
	private int id;
	private String name;

	public Employee(int id, String Name) {
		this.name = Name;
		this.id = id;
	}
	
	
}
