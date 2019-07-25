package com.java.practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FormingGroupTest {

	private static boolean goodLastRead = false;

	public static boolean lastReadWasGood() {
		return goodLastRead;
	}

	public static String readToWhiteSpace(boolean skipLeadingWhiteSpace) throws IOException {
		String input = "";
		char nextChar = 0;
		while (Character.isWhitespace(nextChar = (char) System.in.read())) {
			// accumulate leading white space if skipLeadingWhiteSpace is false:
			if (!skipLeadingWhiteSpace) {
				input += nextChar;
			}
		}
		// the first non white space character:
		input += nextChar;
		// accumulate characters until white space is reached:
		while (!Character.isWhitespace(nextChar = (char) System.in.read())) {
			input += nextChar;
		}
		goodLastRead = input.length() > 0;
		return input;
	}

	public static int Test() throws NumberFormatException, IOException {
		long startTime = System.nanoTime();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		assert n >= 1 && n <= 30000;
		ArrayList<Integer> a = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			a.add(i, Integer.parseInt(readToWhiteSpace(true)));
			assert a.get(i) >= 1 && a.get(i) <= 60000;
		}
		Collections.sort(a);
		if (n == 1) {
			System.out.println(a.get(0));
			return 0;
		}

		long res = a.get(a.size() - 2) + a.get(a.size() - 1);
		int pos = 0;
		long cur = 0;
		for (int i = 0; i < a.size() - 1; i++) {
			while (pos < a.size() && a.get(pos) <= a.get(i) + a.get(i + 1)) {
				cur += a.get(pos);
				++pos;
			}
			res = Math.max(res, cur);
			cur -= a.get(i);

		}

		System.out.println(res);

		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		double mseconds = (double) totalTime / 1_000_000_000.0;
		System.out.println("execution time "+mseconds);
		return 0;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		FormingGroupTest.Test();
	}
}
