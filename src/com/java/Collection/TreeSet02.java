package com.java.Collection;

import java.util.TreeSet;

public class TreeSet02 {

	public static void main(String[]args){
		
		TreeSet t=new TreeSet();
		t.add(new StringBuffer("R"));
		t.add(new StringBuffer("S"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("N"));
		System.out.println(t);
		//in this porgram we will get classcast excpetion...
		
	}
}
