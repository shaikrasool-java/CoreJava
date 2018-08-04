package com.java.loops;

public class While_P {

	public static void main(String[] args) {
		
		int i=0;
		do{
			System.out.println("first loop begin..."+i);
			int j=0;
			do{
				System.out.println("second loop begin..."+j);
				j++;
				if(j>1){
					continue;
				}
			System.out.println("second loop end..."+j);
			}
		
		while(j<2);
			i++;
			System.out.println("loop end..."+i);
			
		}while(i<3);
	}
}
