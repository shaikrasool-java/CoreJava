package com.java.methods;

public class N {

	public static void main(String[] args) {
		
		System.out.println("main begin");
		
		if(true){
			System.out.println("from if");
			return;
		}
	//System.out.println("main end");
	}
}
//here no compile time error and run time error, coz of return statement is within a block it doesn't affected on below statement..
// end of the if statement block, if any statement is there, that will not print...