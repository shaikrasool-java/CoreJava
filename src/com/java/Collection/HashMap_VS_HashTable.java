package com.java.Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMap_VS_HashTable {

	public static void main(String[] args) {
		/*
		 * A HashTable is an array of list. Each list is known as a bucket. 
		 The position of bucket is identified by calling the hashCode() method. 
		 A HashTable contains values based on the key.
		 * it contains only- unique elements.
		 * it doesn't allow any null key or values.
		 * it is synchronized, we can't unsynchronized with any method.
		 * it is a legacy class.
		 * 


		 */
		// HashTable
		Hashtable<Integer,	 String> ht=new Hashtable<>();
		ht.put(101,"apple");
		ht.put(130, "ball");
		ht.put(103, "car");
		ht.put(104, "doll");
		ht.put(101, "apple");
		ht.put(105, "aeroplane");
		System.out.println("*************HashTable********************");
		for(Map.Entry m:ht.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		/*
	* A HashMap contains values based on the key.
	* It contains only unique elements.
	* It may have one null key and multiple null values.
	* It maintains no order.
	* it non-synchronized, but we can synchronized with below method.
	 Map m=Collections.synchronzied(hashmap);
	 *HashMap traversed by iterator.
	 *iterator in HashMap fail-fast.
	 *it is non legacy, introduced in 1.2 version
	
	

		 */
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(101, "apple");
		hm.put(102, "ball");
		hm.put(103, "car");
		hm.put(104,"doll");
		hm.put(null, "apple");
		hm.put(105, "egg");
		hm.put(106, null);
		hm.put(106, "fruit");
		hm.put(107, null);
		System.out.println("****************HashMap********************");
		for(Map.Entry e:hm.entrySet()){
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}

