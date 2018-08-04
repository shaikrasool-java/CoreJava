package com.java.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayL_VS_LinkedL {

	public static void main(String[] args) {
		
		List<String> al=new ArrayList<String>();
		al.add("apple");
		al.add("ball");
		al.add("car");
		al.add("apple");
		System.out.println("**********ArrayList***************");
		System.out.println("arraylist="+al);
		List<String> l=new LinkedList<String>();
		l.add("apple");
		l.add("ball");
		l.add("car");
		l.add("apple");
		System.out.println("***********LinkedList*************");
		System.out.println("linked list="+l);
	}
}
