package com.java.interfaces;

interface Ant{
	void test1();
}
interface Bomb extends Ant{
	void test2();
}


public class M implements Bomb {
	public void test1(){
		System.out.println("from test1");
	}
	public void test2(){
		System.out.println("from test2");
	}
	public static void main(String[] args) {
		M m=new M();
		m.test1();
		m.test2();
	}

}
