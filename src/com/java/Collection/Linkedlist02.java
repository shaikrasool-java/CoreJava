package com.java.Collection;

import java.util.LinkedList;

public class Linkedlist02 {

	public static void main(String[]args){
		
		LinkedList<String> l=new LinkedList<String>();
		
		//adding elements into a linkedlist
		
		l.add("shaik");
		l.add("nabi");
		l.add("rasool");
		l.add("a");
		l.add("b");
		l.add("c");
		l.add(2, "raaj");
		l.add("asmaan");
		l.add("money");
System.out.println("Linked list: "+l);
	
		//removing elemenets from the linked list
		l.remove("shaik");
		l.remove(4);
		l.removeFirst();
		l.removeLast();
System.out.println("linked list after delition: "+l);
	
		//finding elements form linkedlist
		boolean status=l.contains("rasool");
		
		if(status)
		System.out.println("list contatins the elements rasool");
		else
			System.out.println("list doesn't contain element rasool");
		
		//number of element in linked list
		
		
		int i=l.size();
		System.out.println("size of linked list= "+i);
		
		// get and set elements from linked list
		
		Object o=l.get(3);
		System.out.println("element returned bby get() :"+o);
		l.set(3, "rajesh");
		System.out.println("linked list after change; "+l);
		
	}
}
