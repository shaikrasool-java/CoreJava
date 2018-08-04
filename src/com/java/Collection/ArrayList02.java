package com.java.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.Adler32;

public class ArrayList02 {

	public static <E> void main(String[] args) {

		int [] ar=new int[4];
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		 for(int i=0; i<ar.length; i++){
			 System.out.println("array index is "+i+"="+ar[i]);
		 }
      System.out.println(".........................");
      
      ArrayList a=new ArrayList();
      a.add(100);
      a.add(200);
      a.add(300);
      a.add(10.01);
      a.add('r');
      a.add("r");
      a.add(true);
      for(int j=0; j<a.size(); j++){
    	  System.out.println("arraylist index is="+j+" value is="+a.get(j));
      }
		 
      
      ArrayList<Integer> a1=new ArrayList<Integer>();
      a1.add(111);
      
      System.out.println("**********************************");
//addAll()
      ArrayList<String> a2=new ArrayList<String>();
      a2.add("apple");
      a2.add("ball");
      a2.add("car");
      System.out.println("before using addAll method");      
      ArrayList<String> a4=new ArrayList<String>();
      a4.add("door");
      a4.add("elephant");
      a4.add("fruit");
      
      a2.addAll(a4);
      
      for(int i=0; i<a2.size(); i++){
    	  System.out.println(a2.get(i));
      }
      System.out.println("after using addAll method");
      
      //removeAll()
      System.out.println("*************************************");
      a2.removeAll(a4);
      for (int i=0; i<a2.size();i++){
    	  System.out.println(a2.get(i));
      }
      
      System.out.println("***********************************");
      ArrayList<E> a3=new ArrayList<E>();
   System.out.println("*******************************");
      Employee e1=new Employee("rasool", 24, "developer");
      Employee e2=new Employee("rasool", 23, "developer");
      Employee e3=new Employee("rasool", 25, "developer");
      //creating arraylist
      ArrayList<Employee> al=new ArrayList<Employee>();
      
      al.add(e1);
      al.add(e2);
      al.add(e3);
      // iterator to traverse the values
     Iterator<Employee> it=al.iterator();
     while(it.hasNext()){
    	 Employee emp=it.next();
    	 System.out.println("employee name="+emp.name);
    	 System.out.println("employee age="+emp.age);
    	 System.out.println("employee desg="+emp.desg);
     }
      
     System.out.println("*************************************");
     ArrayList<String> a5=new ArrayList<String>();
     a5.add("shaik");
     a5.add("nabi");
     a5.add("rasool");
     
     ArrayList<String> a6=new ArrayList<String>();
     a6.add("shaik");
     a6.add("pandu");
     
     a5.retainAll(a6);
     for (int i=0; i<a5.size(); i++){
    	 System.out.println(a5.get(i));
     }
     
     
      
      
      
      
	}
}
