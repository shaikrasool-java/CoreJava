package com.java.practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class GlobalMembers {
	public static final int INF = 1000000000;
	public static final long INF2 = 1L * INF * INF;
	public static final int MAX = 1007;
	public static final int MAX2 = 1000000;
	public static final int MAXD = 20;
	public static final int BASE = 1000000007;
	public static final int MOD = 1000000007;

	public static int Main() {
		// freopen("in.txt" , "r" , stdin);
		// freopen("out.txt" , "w" , stdout);

		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		assert n >= 1 && n <= 30000;
		ArrayList<Integer> a = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			a.add(i, Integer.parseInt(ConsoleInput.readToWhiteSpace(true)));
			assert a.get(i) >= 1 && a.get(i) <= 60000;
		}
		Collections.sort(a);
		if (n == 1) {
			System.out.print(a.get(0));
			System.out.print("\n");
			return 0;
		}

		long res = a.get(a.size() - 2) + a.get(a.size() - 1);
		int pos = 0;

		long cur = 0;
		for (int i = (0); i < (a.size() - 1); i++) {
			while (pos < a.size() && a.get(pos) <= a.get(i) + a.get(i + 1)) {
				cur += a.get(pos);
				++pos;
			}
			res = Math.max(res, cur);
			cur -= a.get(i);
		}

		System.out.print(res);
		System.out.print("\n");

		return 0;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		GlobalMembers.Main();
	}
}
