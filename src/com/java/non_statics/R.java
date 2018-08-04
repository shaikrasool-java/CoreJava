package com.java.non_statics;
public class R {

	int i;
	void test(){
		System.out.println(this.i);
		this.i=100;
	}
	public static void main(String[] args) {
		R r=new R();
		System.out.println(r.i);
		r.test();
		System.out.println();
	}
}
