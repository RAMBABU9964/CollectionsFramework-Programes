package com.kn.hashmap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import com.kn.treemap.Student;
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap map2=new HashMap();
		map2.put(1, 200);
		map2.put("Two", new Student(111, "Mahesh", 6.7));
		map2.put(3, 500);
		map2.put("Four", "4444");
		map2.put(5, 700);
		System.out.println(map2);
		
		//Accessing keys only using enteryset() method which returns a set object
	      Set keys= map2.keySet();
		 System.out.println("Keys = "+keys);
		
	   //Accessing key-values only using keyset() method which returns a set object
		Set kv = map2.entrySet();
		System.out.println("Key-Values = "+kv);
		
	   //Accessing only values using Values() method which returns a Collection object
		Collection values= map2.values();
		System.out.println("values = "+values);

	}

}
