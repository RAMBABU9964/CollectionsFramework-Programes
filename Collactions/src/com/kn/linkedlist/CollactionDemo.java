package com.kn.linkedlist;

import java.util.LinkedList;

public class CollactionDemo {

	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.add(10);
		list.add(20);
		list.add(2,30);
		list.add(40);
		list.set(2, 33);
		list.add(10);
		
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println("indixof(10) = "+list.indexOf(10));
		System.out.println("last indix of (10) = "+list.lastIndexOf(10));
	}

}
