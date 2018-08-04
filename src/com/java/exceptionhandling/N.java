package com.java.exceptionhandling;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class N {

	public static void main(String []args){
		
		System.out.println("statement one");
		int i=20/0;
		System.out.println("statement two");
	
	try {
		
		System.out.println("statement three");
		
	} catch (ArithmeticException ae) {
		System.out.println("statement four");
	}
	
	System.out.println("statement five");
	}
	
}
