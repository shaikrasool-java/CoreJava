package com.java.methods;

public class G {

	public static void main(String[] args) {
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
public static void test1(){
	System.out.println("test-one begin");
	test2();
	System.out.println("test-one end");

}
public static void test2(){
	System.out.println("test-2 begin");
	System.out.println("test-2 end");
}
}
