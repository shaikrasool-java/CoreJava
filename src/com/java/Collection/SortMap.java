package com.java.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {

	public static void main(String[] args) {
		
		
		Map<String, String> us=new HashMap<>();
		us.put("apple", "apple");
		us.put("banana", "banana");
		us.put("crusted", "crusted");
		us.put("dragon", "dragon");
		 for(Map.Entry<String, String> entry:us.entrySet()){
			 System.out.println("key value="+entry.getKey());
		 }
	Map<String, String> treesort=new TreeMap<String, String>(us);
	 for(Map.Entry<String, String> entry:treesort.entrySet()){
		 System.out.println("sorted key value="+entry.getKey());
	 }

	
		 
		 
	}
	
}
