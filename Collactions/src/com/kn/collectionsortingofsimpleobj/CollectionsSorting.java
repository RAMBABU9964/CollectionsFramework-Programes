package com.kn.collectionsortingofsimpleobj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class CollectionsSorting {

	public static void main(String[] args) {
		//Sorting using treeset
		TreeSet<Integer> lst=new TreeSet<Integer>();
		lst.add(35);
		lst.add(25);
		lst.add(75);
		lst.add(205);
		lst.add(15);
		System.out.println("Using TreeSet = "+lst);
		
		//Sorting using Collection.sort(obj)
       ArrayList<Integer> lst1=new ArrayList<Integer>();
        lst1.add(35);
		lst1.add(25);
		lst1.add(75);
		lst1.add(205);
		lst1.add(15);
		System.out.println("List Befor sorting ="+lst1);
		Collections.sort(lst1);
		System.out.println("List ofter sorting ="+lst1);
	}

}
