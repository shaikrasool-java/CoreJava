package com.java.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondLargest {
    public static int largest = Integer.MIN_VALUE;
    public static int secondLargest = Integer.MIN_VALUE;

    public static void main(String args[]) throws IOException {

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
        if (a.length <= 2) {
            if (a[0] == a[1]) {
                System.out.println("Theres no second largest number in your array");
            } else {
                System.out.println("SecondLargest:" + secondLargest(a));
            }
        } else {
            System.out.println("SecondLargest:" + secondLargest(a));
        }
    }

    private static int secondLargest(int[] a) {

        for (int i = 0; i < a.length; i++) {
                if (a[i] > largest) {
                    secondLargest = largest;
                    largest = a[i];
                } else if (a[i] > secondLargest) {
                    secondLargest = a[i];
                }
            }
        return secondLargest;
    }
}