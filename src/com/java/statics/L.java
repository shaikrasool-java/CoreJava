package com.java.statics;

  class L {

	static int x=2;
	public L(int x)
	{
		x=x+10;
	}
	static void test1(){
		
		System.out.println("test 1-a="+x);
 		int x=3;
		System.out.println("test 1-b="+x);
	}
	static void test2(){
		System.out.println("test 2-a="+x);
		int x=4;
		System.out.println("test 2-b="+x);
	}
	public static void main(String[] args) {
        
		System.out.println("main 1="+x);
		test1();
		System.out.println("main 2="+x);
		x=5;
		test2();
		System.out.println("main 3="+x);
		x=6;
		test2();
		System.out.println("main 4="+x);
		x=7;
		test1();
		System.out.println("main 5="+x);
	}
}
