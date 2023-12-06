package com.kn.traveresing;

import java.util.ArrayList;
import java.util.Iterator;

public class TraversingUsingforloopforeachIteratorDemo {

	public static void main(String[] args) {
		ArrayList<Object> lst=new ArrayList<Object>();
		lst.add("Shirt");
		lst.add("Jeans");
		lst.add("cap");
		lst.add(10);
		lst.add(true);
		
		//Using for loop
		System.out.println("using for loop*******************************");
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
		
		//using for-each loop
		System.out.println("using for-each*******************************");
		for(Object s:lst) {
			System.out.println(s);
		}
		
		//using Iterator
		System.out.println("using iterator*******************************");
		Iterator its=lst.iterator();
		while (its.hasNext()) {
			
			System.out.println(its.next()+" ");
		}
		
		
		
		
		
		
		
		
	}

}
