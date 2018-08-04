package com.java.Collection;

import java.util.Vector;

public class Vector01 {

	public static void main(String[]args){
		
		// constructors of vector class 
		// it create default initial capacity 10 
		Vector v=new Vector();
		
		// Vector v=new Vector(int size);
		//Vector v=new Vector(15);
		
		// Vector v=new Vector(int size, int increment);
		//Vector v=new Vector(10,5);
		
		System.out.println(v.capacity());
		
		for(int i=1; i<=10; i++){
			
			v.addElement(i);
		}
		
		System.out.println(v.capacity());
		v.addElement("r");
		System.out.println(v.capacity());
		System.out.println(v);
	}
	
}
