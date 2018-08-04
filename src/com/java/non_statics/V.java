package com.java.non_statics;

public class V {

	int i;
	void test1(){
		System.out.println("a:"+i);
		test2();
		System.out.println("b:"+i);
	}
	void test2(){
		i=10;
		}
	public static void main(String[] args) {
		
		V v=new V();
		System.out.println("c:"+v.i);
		
		v.test1();
		System.out.println("d:"+v.i);
		
		v.i=20;
		System.out.println("e:"+v.i);
		
		v.test1();
		System.out.println("f:"+v.i);
		
		v.test2();
		System.out.println("g:"+v.i);
	}
	
}
