package com.java.Collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTable01 {

	public static void main(String[] args) {

		/*
		 * it is similar to HashMap and it is synchronized
		 * store the value on the basis of key-value
		 * key --->object--->HashCode--->value
		 * it contains only unique elements
		 * no null key and null values
		 */	

		Hashtable h1=new Hashtable<>();
		h1.put(1, "shaik");
		h1.put(2, "nabi");
		h1.put(3, "rasool");
		h1.put(3, "rasool");
		System.out.println(h1);
		System.out.println("*********************************");

		Hashtable h2=new Hashtable<>();

		h2=(Hashtable)h1.clone();

		System.out.println("h1 object value "+h1);
		System.out.println("h2 object value "+h2);
		h1.clear();
		System.out.println("................................");

		System.out.println("h1 object value "+h1);
		System.out.println("h2 object value "+h2);

		//containsValue()
System.out.println();
System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		Hashtable h3=new Hashtable<>();
		h3.put(1, "shaik");
		h3.put(2, "nabi");
		h3.put(3, "rasool");
		
		if(h3.containsValue("shaik"))
			System.out.println("value is found");
		else 
			System.out.println("doesnt found the value");
		
		// printing the values form HashTable by using Enumeration,with element().
		
		Enumeration e=h3.elements();
		System.out.println("print values from h3");
		
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		System.out.println("-----------------------------");
		//printing all the HashTable values by using entrySet()----set of HashTable values
		
		System.out.println("printing HashTable values by using enteryset()");
		Set s=h3.entrySet();
		System.out.println(s);
		System.out.println("-----------------");
		//checking both HashTables are same or not
		
		
		System.out.println("checking two HashTables are same or not!?");
		Hashtable h4=new Hashtable<>();
		h4.put(1, "shaik");
		h4.put(2, "nabi");
		h4.put(3, "rasool");
		if(h3.equals(h4)) 
			System.out.println("both object are same");
		else 
			System.out.println("both are not same");
	
	}

}
