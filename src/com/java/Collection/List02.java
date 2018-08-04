package com.java.Collection;

import java.util.ArrayList;
import java.util.List;

public class List02 {

	public static void main(String[]args){
		
		List l=new ArrayList();
		
		
		// adding element in list
		l.add(0,"a");
		l.add(1,"b");
		l.add(2, 1);
	
	System.out.println(l);
	
	//let us create another list 
	List L=new ArrayList<>();
	L.add(1);
	L.add(2);
	L.add(3);
System.out.println(L);

//will add L list from 1 index
	l.addAll(3, L);
	System.out.println(l);
	System.out.println();

	//remove element at index 1
	l.remove(1);
	System.out.println(l);
	System.out.println();

	//print element at index 2
	
	System.out.println(l.get(2));
	System.out.println();

	//replace 0 element with 4
	l.set(0, 4);
	System.out.println(l);
	
	
	}
}
