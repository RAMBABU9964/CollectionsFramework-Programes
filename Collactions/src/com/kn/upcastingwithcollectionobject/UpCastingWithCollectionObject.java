package com.kn.upcastingwithcollectionobject;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


public class UpCastingWithCollectionObject {

	public static void main(String[] args) {
		//UpCasting With Collection Object
		List l1=new ArrayList<Integer>();
		l1.add(l1);
		l1.add(3);
		l1.add(4);
		l1.add(12);
		
		List l2=new LinkedList<Integer>();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		
		Queue q1= new ArrayDeque<Integer>();
		q1.add(30);
		q1.add(40);
		q1.add(50);
		
		Queue q2 =new PriorityQueue<Integer>();
		q2.add(25);
		q2.add(35);
		q2.add(45);
	}

}
