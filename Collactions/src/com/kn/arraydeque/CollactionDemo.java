package com.kn.arraydeque;

import java.util.ArrayDeque;

public class CollactionDemo {

	public static void main(String[] args) {
		ArrayDeque ad= new ArrayDeque();
		ad.add(10);
		ad.add(20.5);
		ad.add("Third");
		ad.add(true);
		
		
		System.out.println("First = "+ad.getFirst());
		System.out.println("First = "+ad.getLast());
		
		ad.addFirst(111);
		ad.addLast(999);
		
		System.out.println("First = "+ad.getFirst());
		System.out.println("First = "+ad.getLast());
		System.out.println(ad);
	}

}
