package com.java.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList01 {

	public static  void main(String[]args){
		
		LinkedList l=new LinkedList();
		
		l.add("Shaik");
		l.add("Shiak");
		l.add(123);
		l.add(null);
		System.out.println(l);
		System.out.println();
		l.set(0,"Rasool");
		System.out.println(l);
		System.out.println();
		
		l.add(4, "developer");
		l.remove();
		
		System.out.println(l);
		System.out.println();
		l.addFirst("R|R");
		System.out.println(l);
		System.out.println();
		l.addLast("rajesh");
		System.out.println(l);
		System.out.println();
	    l.removeFirstOccurrence(l);
	    System.out.println(l);
	    System.out.println(l.size());
	  System.out.println("***************************************");
	    
	  // how to print all the values by using below methods
	  //using for loop
	  
	  LinkedList<String> lk=new LinkedList<String>();
	  lk.add("apple");
	  lk.add("ball");
	  lk.add("car");
	  
	  System.out.println("using for loop");
	  for(int i=0; i<l.size();i++){
		  System.out.println(l.get(i));
	  }
	  
	  //using  adv for loop
	  System.out.println("using adv for loop");
	  for (String str : lk){
		  System.out.println(str);
	  }
		
	  
	 // using iterator
	  
	  System.out.println("using iterator");
		Iterator<String> itr=lk.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//using while loop
		int num=0;
		while(lk.size()>num){
			System.out.println(lk.get(num));
			num++;
		}
	
	
}
}