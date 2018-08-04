package com.java.StringHandling;

import java.util.Scanner;

public class ConcatinateTwoStrings {

	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		String s=sc.nextLine();
		
		System.out.println("enter the seconcd string");
		String s1=sc.nextLine();
		System.out.println("concatinated two strings result is: "+s.concat(" "+s1));
		
	}
	
}
