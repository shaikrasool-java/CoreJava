package com.java.non_statics;

public class T {

	int i;
	void test(){
		i=10;
		System.out.println(i);
		
	}
	public static void main(String[] args) {
		T t=new T();
		System.out.println(t.i);
		t.test();
		System.out.println("method:"+t.i);
	}
}
