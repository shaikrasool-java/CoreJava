package com.java.Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator01 {

	public static void main(String[]args){
		
		LinkedList l=new LinkedList();
		
		l.add("rasool");
		l.add("rajesh");
		l.add("sky");
		l.add("shaik");
		
		System.out.println(l);
		
		
		ListIterator li=l.listIterator();
		while(li.hasNext()){
			
			String s=(String)li.next();
			
			if(s.equals("rasool")){
				li.remove();
			}
			else if(s.equals("rajesh")){
				li.add("lucky");
			}
			else if(s.equals("sky")){
				li.add("assmaaan");
			}
		}
		
		System.out.println(l);
		
			}
	
}
