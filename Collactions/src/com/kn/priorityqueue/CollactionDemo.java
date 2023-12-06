package com.kn.priorityqueue;

import java.util.PriorityQueue;

public class CollactionDemo {

	public static void main(String[] args) {
		PriorityQueue <String>pq =new PriorityQueue<String>();
		
		pq.add("Two");
		pq.add("Twenty");
		pq.add("Thirty");
		
		PriorityQueue<Integer> p2 =new PriorityQueue<Integer>();
      p2.add(20);
      p2.add(10);
      p2.add(5);
      p2.add(30);
      p2.add(40);
      
      System.out.println(pq);
      System.out.println(p2);
	}

}
