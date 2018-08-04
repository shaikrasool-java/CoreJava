package com.java.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap_VS_TreeMap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(101, "apple");
		hm.put(102, "ball");
		hm.put(null, "car");
		hm.put(103, null);
		hm.put(104, null);
		
		System.out.println("************HashMap*************");
	for(Map.Entry<Integer, String> m:hm.entrySet()){
		
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	TreeMap<Integer, String> tm=new TreeMap<>();
	tm.put(101, "apple");
	tm.put(102, "ball");
	tm.put(103, null);
	//tm.put(null, "car"); doesn't not allow null key but many null values be accepted
	tm.put(105, null);
	
	System.out.println("*****************TreeMap****************");
	System.out.println("tm firstKey()="+tm.firstKey());
	
	for(Map.Entry<Integer, String> t:tm.entrySet()){
		System.out.println(t.getKey()+" "+t.getValue());
	}
	
	
	}
	
	
}
