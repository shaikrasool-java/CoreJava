package com.java.loops;

public class Q {
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++){
			System.out.println("loop begin...");
			
			if(i>2){
				System.out.println(i);
				break;
				//System.out.println("if block");
			}
			System.out.println("loop end...");
		}
		System.out.println("main end...");
	}

}
