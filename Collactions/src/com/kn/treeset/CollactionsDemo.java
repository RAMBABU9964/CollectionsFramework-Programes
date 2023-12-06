package com.kn.treeset;

import java.util.TreeSet;

public class CollactionsDemo {
public static void main(String[] args) {
	TreeSet set= new TreeSet();
	set.add(20);
	set.add(30);
	set.add(25);
	set.add(10);
	set.add(10);//Duplicate data not allowed
	set.add(15);
	set.add(5);
	set.add(18);
	//set.add(1.5);// Heterogenoues data not allowed
	System.out.println(set);
}
}
