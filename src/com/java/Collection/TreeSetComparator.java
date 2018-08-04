package com.java.Collection;

import java.util.Comparator;
import java.util.TreeSet;



class MyComparator implements Comparator{

public int compare(Object obj1, Object obj2){

	String s1=obj1.toString();
	String s2=(String)obj2;
	//return s2.compareTo(s1);
	
	return -s1.compareTo(s2);
	}
	
}


public class TreeSetComparator {

	public static void main(String[]args){
		
		
		TreeSet t=new TreeSet(new MyComparator());
		t.add("Sharma");
		t.add("Rajesh");
		t.add("Rasool");
		t.add("Asmaaan");
		t.add("Bhai");
		System.out.println(t);
		
	}
}
