package com.java.statics;

public class G {

	static int test(){
		return 10;
		
	}
	static int x=test();
	public static void main(String[] args) {
		System.out.println(x);
	}
}
