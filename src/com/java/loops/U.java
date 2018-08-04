package com.java.loops;

public class U {

	public static void main(String[] args) {
		
		loop1:
			for(int i=0; i<2;i++){
				System.out.println("loop begin...");
				
				for(int j=0;j<3;j++){
					System.out.println("second loop begin...");
				
				if(j<2){
					break loop1;
				}
				System.out.println("second loop end");
				}
			System.out.println("loop end");
			}
		System.out.println("main end");
	}

}
