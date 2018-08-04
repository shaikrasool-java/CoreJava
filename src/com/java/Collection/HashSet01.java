package com.java.Collection;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[]args){
		
		HashSet h=new HashSet();
		
		h.add("a");
		h.add("c");
		h.add("b");
		h.add(null);
		h.add("d");
		h.add(100);
		
		System.out.println(h.add("d"));
		System.out.println(h);
		
	}
	
}
