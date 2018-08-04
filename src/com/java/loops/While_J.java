package com.java.loops;

public class While_J {

	public static void main(String[] args) {
		
		int i=0;
		while(i<5){
			System.out.println("first loop begin...");
			
			int j=0;
			while(j<5){
				j++;
				System.out.println("second loop begin...");
				if(j>1){
					break;
				}
			System.out.println("second loop end...");
			}
		System.out.println("first loop end...");
		i++;
		}
	}
}
