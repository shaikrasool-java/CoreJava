package com.java.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size of Array:");
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		System.out.println("Enter the elements on array:");
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Elements you entered are:");
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]" + "=" + a[i]);
		}
	}
}
