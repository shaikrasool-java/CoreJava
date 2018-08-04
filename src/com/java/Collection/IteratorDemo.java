package com.java.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		//traverse elements
		Iterator<Integer> it=al.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
			System.out.println(it.hasNext());
			
		}
	}
}
