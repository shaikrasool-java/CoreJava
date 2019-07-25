package com.java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountEachCharacterInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);
			}
			
		}
		System.out.println(m);
	}
}
