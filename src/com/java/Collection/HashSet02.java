package com.java.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet02 {

	public static void main(String[]args){
		
		HashSet<String> h=new HashSet<String>();
		
		// adding elements in hashset
		h.add("india");
		h.add("usa");
		h.add("uae");
		h.add("uk");
		
		//printing elements in hashset
		System.out.println(h);
		System.out.println("list contain India or not: "+h.contains("india"));
		
		//removing an item from list
		h.remove("uk");
		System.out.println("after removing object from list...:"+h);
		
		//Iterating over hashset items
		System.out.println("iterating set items");
		
		Iterator<String> i=h.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
	
}
