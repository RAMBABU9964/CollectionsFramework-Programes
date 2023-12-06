package com.kn.collectioncomplexsorting;

import java.util.ArrayList;
import java.util.Collections;

public class ComplexSortingDemo {

	public static void main(String[] args) {
		Student s1=new Student(14, "abc", 73.5);
		Student s2=new Student(12, "def", 60.3);
		Student s3=new Student(11, "pqr", 70.8);
		Student s4=new Student(13, "xyz", 65.5);

//		String str =new String("kjidnj");
//		System.out.println(str.toString());
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
		
		ArrayList<Student> stList=new ArrayList<Student>();
		stList.add(s1);
		stList.add(s2);
		stList.add(s3);
		stList.add(s4);
		
		System.out.println("==>Before Sorting");
		System.out.println(stList);
		//Collection.sort(stList); complex object can't be sort this way
		Collections.sort(stList);
		System.out.println("==>Ofter Sorting");
		System.out.println(stList);
	}

}
