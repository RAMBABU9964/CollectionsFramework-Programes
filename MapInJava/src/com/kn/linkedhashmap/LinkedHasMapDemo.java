package com.kn.linkedhashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

import com.kn.treemap.Student;

public class LinkedHasMapDemo {

	public static void main(String[] args) {
		HashMap map3=new LinkedHashMap<>();
		map3.put(1, 200);
		map3.put("Two", new Student(111, "Mahesh", 6.7));
		map3.put(3, 500);
		map3.put("Four", "4444");
		map3.put(5, 700);
		System.out.println(map3);
		
	//Accessing keys only using enteryset() method which returns a set object
      Set keys= map3.keySet();
	 System.out.println("Keys = "+keys);
	
   //Accessing key-values only using keyset() method which returns a set object
	Set kv = map3.entrySet();
	System.out.println("Key-Values = "+kv);
	
   //Accessing only values using Values() method which returns a Collection object
	Collection values= map3.values();
	System.out.println("values = "+values);
	}

}
