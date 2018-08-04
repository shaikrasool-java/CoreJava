package com.java.practice;
 interface life{
	 void run();
 }
public class Interface implements life {

	public void run(){
		System.out.println("going.....anthe...");
	}
	public static void main(String[] args) {
		Interface i=new Interface();
		i.run();
		life l=new Interface();
		l.run();
	}
	
	
}
