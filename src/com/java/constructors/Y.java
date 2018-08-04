package com.java.constructors;

public class Y {

	Y(int i){
		this();
		System.out.println("Y(int i)");
	}
	{
		System.out.println("from instance block");
	}
	Y(){
		System.out.println("Y()");
	}
		public static void main(String[] args) {
			Y y=new Y();
			Y y1=new Y(10);
		}
}
