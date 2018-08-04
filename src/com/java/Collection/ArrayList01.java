package com.java.Collection;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[]args){
		
		ArrayList al=new ArrayList();
		System.out.println(al.size());
		al.add("r");
		al.add(1);
		al.add("r");
		al.add(null);
		
		System.out.println(al);
		System.out.println(al.hashCode());
		System.out.println();
		System.out.println(al.clone());
		System.out.println();
		System.out.println(al.isEmpty());
		System.out.println();
		System.out.println(al.get(2));
		al.remove(1);
		System.out.println(al);
		
		al.add("a");
		al.add(2,"j");
		System.out.println(al);
		System.out.println(al.size());
		
	}
	
}
