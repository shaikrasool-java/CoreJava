package com.java.Collection;

import java.util.Stack;

public class Stack01 {

	public static void main(String[]args){
		
		Stack s=new Stack();
		
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		
		System.out.println(s);
		System.out.println(s.search("a"));
		System.out.println(s.search("r"));
		
		System.out.println(s.pop());
		System.out.println();
		
		System.out.println(s.peek());
		System.out.println(s);
		
		System.out.println(s.peek());
		
		s.empty();
		
	}
	
}
