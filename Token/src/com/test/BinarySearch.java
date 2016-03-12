package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		List<String> studentList = new ArrayList();
		studentList.add("StudentLema");
		studentList.add("StudentHenok");
		studentList.add("StudentGirma");
		studentList.add("StudentGomen");
		studentList.add("StudentDinich");
		
		
		List<Integer> studentID=new ArrayList<>();
		studentID.add(34);
		studentID.add(54);
		studentID.add(24);
		studentID.add(84);
		studentID.add(14);
		
		Collections.sort(studentID);
		
		System.out.println(studentID);
		
		int d=Collections.binarySearch(studentID, 54);
		System.out.println(d);
		
		
		System.out.println("Before Sorting: "+studentList);
		
		Collections.sort(studentList);
		
		System.out.println("After Sorting: "+studentList);
		
		
		int k=Collections.binarySearch(studentList, "StudentHenok");
		
		System.out.println(k);
		
	}

}
