package com.java.Collection;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.java.constructors.S;

public class HashMap01 {

	public static void main(String []args){
		/*	*HashMap is a class implements map interface
		 *extends AbstractMap
		 *it contains only unique elements
		 *store the values key value pair
		 *it may have one null key and multiple null values 
		 *it maintains no order
		 *HashMap is non-synchronized, non thread safe
		 *concurrent modification exception--- fail-fast condition.
		 */
		HashMap<String, Integer>h=new HashMap<String, Integer>();

		h.put("abc", new Integer(100));
		h.put("b", new Integer(200));
		h.put("c", new Integer(300));
		h.put("d", new Integer(400));

		//returns set view

		Set<Map.Entry<String,Integer>> st=h.entrySet();

		for(Map.Entry<String, Integer>me:st){

			System.out.println(me.getKey()+":"+me.getValue());
			//			System.out.println(me.getValue());
		}
		System.out.println("*********************************");
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "shaik");
		hm.put(2, "nabi");
		hm.put(3, "rasool");
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		System.out.println(hm.get(4));

		for(Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("********************************************");

		HashMap<Integer, Employee> hmp=new HashMap<Integer, Employee>();

		Employee e1=new Employee("shaik", 24, "dev");
		Employee e2=new Employee("nabi", 22, "tester");
		Employee e3=new Employee("rasool", 24, "DB");

		hmp.put(1, e1);
		hmp.put(2, e2);
		hmp.put(3, e3);

		//traversing key and values
		for(Entry<Integer, Employee> m: hmp.entrySet()){
			int key=m.getKey();
			Employee e=m.getValue();
			System.out.println("employee "+key+" info");

			System.out.println(e.name+" "+e.age+" "+e.desg);
			System.out.println("--------------------------------");
		}
	}
}
