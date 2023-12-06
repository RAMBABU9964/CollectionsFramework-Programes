package com.kn.treemap;

import java.util.TreeMap;

public class TreeMapeDemo {

	public static void main(String[] args) {
       TreeMap map1=new TreeMap<>();
       map1.put(1, 100);
       map1.put(2, new Student(11, "ram", 7.6));
       map1.put(3, 500);
       map1.put(4, new Student(22, "Shyam", 8.6));
       map1.put(5, 200);
       System.out.println(map1);
	}

}
