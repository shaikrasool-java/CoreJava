package com.java.Collection;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Fail_safe{

	public static void main(String[] args) 
	{
		ConcurrentHashMap<Integer,String> hm=new ConcurrentHashMap<Integer,String>();
		hm.put(1000,"Madala");
		hm.put(1001,"Nalanda");
		hm.put(1002,"Naveen");
		Iterator<Integer> i=hm.keySet().iterator();
		Iterator <String> s=hm.values().iterator();
		while(i.hasNext())
		{
			System.out.println(i.next()+" "+s.next());
			hm.put(1003,"Nandini");
			
			
		}

	}

}