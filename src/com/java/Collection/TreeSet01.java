package com.java.Collection;

import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[]args){
		
		TreeSet t=new TreeSet();
		
		t.add("A");
		t.add("B");
		t.add("C");
		t.add("a");
		//t.add(null); we will get nullpointer exception
		
		//adding duplicates element in treeset but it will get duplicate elements not inserted
		//no compile time error and run time exectption
		t.add("a");
		
		//hetrogenious objects are not allowed..
		//t.add(1);
		System.out.println(t);
		
		
	}
}
