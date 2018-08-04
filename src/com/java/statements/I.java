package com.java.statements;

public class I {

	public static void main(String[] args) {
		
		int i=11;
		
		switch(i){
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 10:
			System.out.println("from 10");
			break;
		case 2:
		case 4:
		case 6:
		case 8:
			System.out.println("odd");
			break;
			default:
				System.out.println("num is greater than 10");
		}
	}
}
