package com.java.StringHandling;

import java.util.Scanner;

public class StringLastValue {

	public static void main(String[]arsg){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s=sc.nextLine();
		int index=0;
		index=s.lastIndexOf("");
		System.out.println("last index value is: "+index);
	}
}
