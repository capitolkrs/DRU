package com.test;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

	@Override
	public int compare(String student1, String student2) {
		
		return student1.compareToIgnoreCase(student2);
		
	}
	

}
