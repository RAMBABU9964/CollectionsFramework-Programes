package com.kn.comparatorsortingcomplex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorSortingDemo {

	public static void main(String[] args) {
		Student1 s1=new Student1(14, "xyz", 73.5);
		Student1 s2=new Student1(12, "def", 60.3);
		Student1 s3=new Student1(11, "pqr", 70.8);
		Student1 s4=new Student1(13, "abc", 65.5);

//		String str =new String("kjidnj");
//		System.out.println(str.toString());
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
		
		ArrayList<Student1> stList=new ArrayList<Student1>();
		stList.add(s1);
		stList.add(s2);
		stList.add(s3);
		stList.add(s4);
		
		System.out.println("==>Before Sorting");
		System.out.println(stList);
		
		
		//Collection.sort(stList); complex object can't be sort this way
		
		SortStudentByID s = new SortStudentByID();
	    Collections.sort(stList,s);
	
		
		
		//<====Sorting based on id====>
		//Collections.sort(stList,new Comparator<Student1>() {
       
//			@Override
//			public int compare(Student1 s1, Student1 s2) {
//				if(s1.id>s2.id) {
//					return 1;
//				}else if(s1.id<s2.id) {
//					return -1;
//				}else {
//				return 0;
//				
//			}}
			
//		});
		
		
		//<====Sorting based on name====>
		
//		Collections.sort(stList, new Comparator<Student1>() {
//
//			@Override
//			public int compare(Student1 s1, Student1 s2) {
//				
//				return s1.getName().compareTo(s2.getName());
//			}
//			});
		
		//<=====Sorting based on Percentage====>
		
//		Collections.sort(stList,new Comparator<Student1>() {
//		       
//				@Override
//					public int compare(Student1 s1, Student1 s2) {
//						if(s1.Percentage>s2.Percentage) {
//							return 1;
//						}else if(s1.Percentage<s2.Percentage) {
//							return -1;
//						}else {
//						return 0;	
//				}}	
//				});
		
		
		
		System.out.println("==>Ofter Sorting");
		System.out.println(stList);
	}

	}


