package com.java.loops;

public class R {

	public static void main(String[] args) {
		
		for(int i=0;i<2;i++){
			System.out.println("loop begin...");
			
			for(int j=0;j<5;j++){
				System.out.println("second loop begin...");
				if(j>2){
					continue;
				}
				System.out.println("second loop end...");
			}
				System.out.println("loop end...");
		
	}
	
			System.out.println("main end...");
	}

}
