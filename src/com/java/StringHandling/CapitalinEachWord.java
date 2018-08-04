package com.java.StringHandling;

import java.util.Scanner;

public class CapitalinEachWord {

	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string here:");
		String s=sc.nextLine();
		String cap="";
		
		Scanner lineScan=new Scanner(s);
		while(lineScan.hasNext()){
			
			String word=lineScan.next();
			cap +=Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
			
			System.out.println("original sentence: "+s);
			System.out.println("required sentence:"+cap.trim());
		}
		
		
	}
}
