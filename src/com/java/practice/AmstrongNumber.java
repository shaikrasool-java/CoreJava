package com.java.practice;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {

		int n, sum = 0, temp, r;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numeber: ");
		n = sc.nextInt();

		temp = n;
		while (temp > 0) {
			r = temp % 10;
			System.out.println("r value: " + r);
			sum = sum + r * r * r;
			System.out.println("sum of the number: " + sum);
			temp = temp / 10;
		}

		if (n == sum) {
			System.out.println("this number is Amstrong " + n);
		} else {
			System.out.println("given number is not amstrong");
		}
		sc.close();

	}
}
