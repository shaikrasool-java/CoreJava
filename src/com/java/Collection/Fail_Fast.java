package com.java.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Fail_Fast {
	

		public static void main(String[] args) 
		{
			Map<Integer,String> hm=new HashMap<Integer,String>();
			hm.put(1000,"Madala");
			hm.put(1001,"Nalanda");
			hm.put(1002,"Naveen");
			Iterator<Integer> i=hm.keySet().iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
				hm.put(1003,"Nandini");
			}

		}

	}

