package com.java.Collection;

import java.util.ArrayList;
import java.util.Iterator;

import com.java.inheritance.C;

public class Iterator01 {

	public static void main(String[]args){
		
		ArrayList al=new ArrayList();
		
		for(int i=0;i<=10;i++){
			al.add(i);
			
		}
		
		
		System.out.println(al);
		
		Iterator i=al.iterator();
		while(i.hasNext()){
			
			Integer I=(Integer)i.next();
			if(I%2==0)
				System.out.println(I);
			else
				i.remove();
		}
		System.out.println(al);
		
	}
	
	
}
