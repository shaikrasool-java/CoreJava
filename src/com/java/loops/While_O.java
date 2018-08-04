 package com.java.loops;

public class While_O {

	public static void main(String[] args) {
	
		int i=0;
		do{
			System.out.println("first loop begin..."+i);
		int j=0;
		do{
			System.out.println("second loop begin..."+i);
			j++;
			System.out.println("second loop end..."+j);
		}
		while(j>2);
		i++;
		System.out.println("first loop end..."+i);
		}
	while(i<3);
		
	}
}
