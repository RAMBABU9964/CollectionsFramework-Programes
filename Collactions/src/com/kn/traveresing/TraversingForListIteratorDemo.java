package com.kn.traveresing;

import java.util.ArrayList;
import java.util.ListIterator;

public class TraversingForListIteratorDemo {

	public static void main(String[] args) {
		//Backworld travering for list implements class
		ArrayList<Integer> lst=new ArrayList<Integer>();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		
		//Using ListIterator
		ListIterator<Integer> itr=lst.listIterator(lst.size());
		while (itr.hasPrevious()) {
			System.out.println(itr.previous()+" ");
			
		}
	}

}
