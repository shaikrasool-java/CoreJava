package com.java.statics;

public class U {

	static int i=10;
	static int j=test();
		static int test(){
			System.out.println("from test");
			return i;
		}
		public static void main(String[] args) {
			System.out.println("main");
			System.out.println(i);
			System.out.println(j);
		}
}
