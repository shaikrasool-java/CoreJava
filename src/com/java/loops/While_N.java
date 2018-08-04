package com.java.loops;

public class While_N {

	public static void main(String[] args) {
		
		int i=0;
		do{
			System.out.println("begin...");
			i++;
			if(i>3){
				continue;
			}
			System.out.println("main end...");
		}
		
		
		while(i<5);
	}
}
