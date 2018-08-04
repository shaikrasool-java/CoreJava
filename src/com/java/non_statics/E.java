package com.java.non_statics;

public class E {
	
	void test1(){

		System.out.println("from test 1");
		
	}
	void test2(){
		System.out.println("from test 2");
	}
		public static void main(String[] args) {
			
			System.out.println("main begin");
			
			E e=new E();
			
			e.test1();
			
			System.out.println("-----------");
			
			e.test2();
			System.out.println("-----------");
			
			e.test1();
			System.out.println("------------");
			e.test2();
			System.out.println("-------------");
			
			System.out.println("main end");
		
		
		}

}
