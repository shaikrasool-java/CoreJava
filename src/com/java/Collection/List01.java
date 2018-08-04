package com.java.Collection;

import java.util.ArrayList;

public class List01 {
	
	public static void main(String[] args){
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("shaik");
		a.add("nabi");
		a.add("rasool");
		
		System.out.println("getting 2n position element::"+a.get(2));
		
		for(String s:a){

			System.out.println(s);
		}
		
		
	}

}
