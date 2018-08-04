package com.java.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap02 {

	public static void main(String[]args){
		
		HashMap h=new HashMap();
		h.put("Rasool",101);
		h.put("Shiak", 102);
		h.put("Rajesh", 103);
		h.put("Asmaan", 104);
		System.out.println(h);
	System.out.println(h.put("Rasool", 105));
	Set s=h.keySet();
	System.out.println(s);
	Collection c=h.values();
	System.out.println(c);
	Set s1=h.entrySet();
	System.out.println(s1);
	
	Iterator i=s1.iterator();
	while(i.hasNext()){
		Map.Entry m=(Map.Entry)i.next();
		System.out.println(m.getKey()+"..."+m.getValue());
		
		if(m.getKey().equals("Rajesh")){
			m.setValue(143);
			
		}
	}
		System.out.println(h);
		
		
	}
}
