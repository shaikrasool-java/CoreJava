package com.java.Collection;

import java.util.ArrayList;
import java.util.List;

public class List03 {

	public static void main(String[]args){
		
		//using safe array list it stores only string types
		
		List<String> l=new ArrayList<>();
		
		l.add("Shaik");
		l.add("Nabi");
		l.add("Rasool");
		
		System.out.println("first element of index is: "+l.indexOf("Shaik"));
		System.out.println("last element of index is: "+ l.lastIndexOf("Rasool"));
		System.out.println("index of element is not present in index:"+l.indexOf("hello"));
		
	}
}
