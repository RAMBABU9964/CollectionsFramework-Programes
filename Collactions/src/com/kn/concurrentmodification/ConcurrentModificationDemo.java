package com.kn.concurrentmodification;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationDemo {

	public static void main(String[] args) {
       CopyOnWriteArrayList list= new CopyOnWriteArrayList();
       list.add(10);
       list.add(20);
       list.add(30);
       list.add(40);
       list.add(50);
       System.out.println(list);
       
       int temp=40;
       //Concurrent modification with for loop==> infinat loop
//       for(int i=0;i<list.size();i++) {
//    	   System.out.println(list.get(i));
//    	   list.add(temp);
//    	   temp +=10;
//       }
       
       //Concurrent modification with for-each loop==>ConcurrentModificationException
//       for(Object i:list) {
//    	   System.out.println(i+" ");
//    	   list.add(temp+=10);
//       }
       
       
       //Concurrent modification with Iterator==>ConcurrentModificationException
       Iterator itr = list.iterator();
       while(itr.hasNext()) {
    	   System.out.println(itr.next()+" "); //reading
        	   list.add(temp+=10);             //writing
       }
	}

}
