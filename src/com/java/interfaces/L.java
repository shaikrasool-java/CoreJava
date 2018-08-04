package com.java.interfaces;

interface Xman{
	void test1();
}

interface Yogi{
	void test2();
}
interface Zen{
	void test3();
}


public class L implements Xman, Yogi,Zen{
	
	public void test1(){
		System.out.println("from test1");
	}
	public void test2(){
		System.out.println("from test2");
			}
	public void test3(){
		System.out.println("from test3");
	}
	public static void main(String[] args) {
		
		L l=new L();
		l.test1();
		l.test2();
		l.test3();
	}
}
