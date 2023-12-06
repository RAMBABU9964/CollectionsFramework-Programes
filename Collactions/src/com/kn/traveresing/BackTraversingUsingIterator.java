package com.kn.traveresing;

import java.util.ArrayDeque;
import java.util.Iterator;

public class BackTraversingUsingIterator {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad= new ArrayDeque<Integer>();
		ad.add(10);
		ad.add(57);
		ad.add(96);
		ad.add(256);
		
		//using descendingIterator
		Iterator<Integer> its=ad.descendingIterator();
		while (its.hasNext()) {
			
			System.out.println(its.next()+" ");
		}
		
	}

}
