package com.java.non_statics;

public class Q {

	int i;
	void test(){
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		Q q=new Q();
		q.i=10;
				q.test();
	}
}
