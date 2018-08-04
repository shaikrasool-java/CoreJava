package com.java.Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet01 {
	
	public static void main(String[]args){
		
		SortedSet<String> s=new TreeSet<String>();
		s.add("shaik");
		s.add("rasool");
		s.add("rajesh");
		s.add("aasmaan");
		
		System.out.println("Sorted set: "+s);
		System.out.println("First: "+s.first());
		System.out.println("Last: "+s.last());
		System.out.println();
		
		//getting elements before excluding in a sorted set
		SortedSet<String> s1=s.headSet("rajesh");
		System.out.println("used headset: "+s1);
		//getting elements using tailset
		SortedSet<String> s2=s.tailSet("rasool");
		System.out.println("used tailset: "+s2);
		
		//getting elements between sortedset
		SortedSet<String> s3=s.subSet("shaik", "rajesh");
		System.out.println(s3);
	}
	

}
