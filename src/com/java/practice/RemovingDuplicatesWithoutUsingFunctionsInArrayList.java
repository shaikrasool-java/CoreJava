package com.java.practice;

import java.util.ArrayList;
import java.util.List;

public class RemovingDuplicatesWithoutUsingFunctionsInArrayList {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(30);
		li.add(40);
		li.add(10);

		Object[] arr = li.toArray();
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			int count = 0;
			for (int j = i + 1; j < length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(arr[i]);
			}
		}

	}
}
