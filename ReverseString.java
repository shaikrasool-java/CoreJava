package com.java.practice;

import java.util.Scanner;

public class ReverseString {

	public void reverse(String[] source) {

		String dest = "";
		for (int n = source.length - 1; n >= 0; n--) {
			dest += source[n] + " ";
		}
		System.out.println(dest);
	}

	public static void main(String args[]) {
		ReverseString rs = new ReverseString();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String[] str = sc.nextLine().split(" ");
		rs.reverse(str);
		sc.close();
	}

}