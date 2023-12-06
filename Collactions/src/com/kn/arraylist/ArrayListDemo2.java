package com.kn.arraylist;
import java.util.ArrayList;
public class ArrayListDemo2 {
	public static void main(String[] args) {
		
		ArrayList lst1=new ArrayList();
		lst1.add(10);
		lst1.add(20);
		lst1.add(30);
		lst1.add(40);
		lst1.add(50);
		
		ArrayList lst2=new ArrayList();
		
		lst2.add("one");
		lst2.add("two");
		lst2.add("three");
		lst2.add("four");
		lst2.add("five");
		
		//list2.addAll(lst1);//add all element of specified collection at the end
		
		lst2.addAll(2, lst1);//add all element of specified at the specified indix
		
		System.out.println(lst2);
		
	}

}
