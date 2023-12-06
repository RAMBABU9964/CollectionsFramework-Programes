package com.kn.wrapperclass1;

import java.util.ArrayList;

public class WrapperDemo {

	public static void main(String[] args) {
		ArrayList<Integer> lst1=new ArrayList<>();
		lst1.add(10);  //lst1.add(new Integer(10))
		lst1.add(20);  //lst1.add(new Integer(10))
		lst1.add(30);  //lst1.add(new Integer(10))
    System.out.println("Element = "+lst1);
    
    int i1=lst1.get(0);   //(int)lst1.get(0)
    int i2=lst1.get(1);   //(int)lst1.get(0)
    int i3=lst1.get(2);   //(int)lst1.get(0)
    System.out.println("i1 = "+i1);
    System.out.println("i2 = "+i2);
    System.out.println("i3 = "+i3);
	}

}
