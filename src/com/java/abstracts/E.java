package com.java.abstracts;

abstract class Food{
	
	void test(){
		System.out.println("from test");
	}
}

public class E extends Food{

		public static void main(String[] args) {
			
			E e=new E();
			e.test();
		}
}
