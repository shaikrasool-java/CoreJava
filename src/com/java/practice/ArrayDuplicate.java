package com.java.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayDuplicate {
	public static void main(String args[]) {
		// Sample code to perform I/O:
		//* Use either of these methods for input

		//BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name= "";
		try {
			name = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}                // Reading input from STDIN
		//        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

		/*
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

		 */

		// Write your code here
		String arr[] = name.split(" ");
		int n = arr.length; 
		if (n==0 || n==1) 
			return ; 

		 Arrays.sort(arr);
		String temp[] = new String[n]; 

		// Start traversing elements 
		int j = 0; 
		for (int i=0; i<n-1; i++) 

			// If current element is not equal 
			// to next element then store that 
			// current element 
			if (!arr[i].equals(arr[i+1])) 
				temp[j++] = arr[i]; 

		// Store the last element as whether 
		// it is unique or repeated, it hasn't 
		// stored previously 
		temp[j++] = arr[n-1]; 

		// Modify original array 
		for (int i=0; i<j; i++) 
			arr[i] = temp[i]; 

		for (int i=0; i<j; i++) 
			System.out.print(arr[i]+ " ");  
	} 
}
