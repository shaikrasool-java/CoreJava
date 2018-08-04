package com.java.non_statics;

public class C {

	void test(){
		System.out.println("from test");
	}
		public static void main(String[] args) {
			
			System.out.println("main begin");
			C c=new C();
			c.test();
			System.out.println("main end");
			
		}
}
