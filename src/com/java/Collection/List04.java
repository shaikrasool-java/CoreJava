package com.java.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class List04 {
	
	public static void main(String[] args) {
	
		List a=new ArrayList();
		List b=new LinkedList();
		List c=new Vector();
		List d=new Stack();
		
		System.out.println("arraylist="+a.hashCode());
		System.out.println("linkedlist="+b.hashCode());
		System.out.println("vector="+c.hashCode());
		System.out.println("stack="+d.hashCode());
		
	}

}
