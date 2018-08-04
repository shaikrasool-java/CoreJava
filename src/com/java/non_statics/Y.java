package com.java.non_statics;

public class Y {
	
	int i;
	void test(){
		Y y=new Y();
		y.i=i;
		System.out.println("from test-a:"+y.i);
		System.out.println("from test-b:"+i);
		
	}
	public static void main(String[] args) {
		
		Y y1=new Y();
		y1.i=20;
		System.out.println(y1.i);
		y1.test();
		
	}
}
