package com.java.Collection;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {

	public static void main(String[]args){
		
		
		LinkedHashSet<String> l=new LinkedHashSet<String>();
		
		//adding elements in linkedhashset
		
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		l.add(null);

	
	// these elements are not add new elements are already exists...
		l.add("a");
		l.add("e");

	System.out.println("Size of liknedHashSet= "+l.size());
	System.out.println("original linked hash set= "+l);
	System.out.println("removing element form linked hash set= "+l.remove("d"));
	System.out.println("trying to remove element 'g' which is not present in linked hash set= "+l.remove("g"));
	System.out.println("checking element 'a' is present in list or not= "+l.contains("a"));
	System.out.println("updated linked hash set= "+l);
	}
	
}
