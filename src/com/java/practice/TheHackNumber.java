package com.java.simple;
import java.util.Scanner;

public class TheHackNumber
{
	public static int Main()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int T;
		int	I ;
		System.out.println("enter the no of test cases");
		T = sc.nextInt();
	
		assert 1 <= T && T <= 100;
		while ((T--) != 0)
		{
			
			String S1 = null;
			S1 = "we love to hack on hackerearth";
				assert 1 <= S1.length() && S1.length() <= 50;
				for (int i = 0;i <= S1.length() - 1; ++i)
				{
					assert 'A' <= S1.charAt(i) && S1.charAt(i) <= 'Z' || 'a' <= S1.charAt(i) && S1.charAt(i) <= 'z';
				}
			
			
			String S2=null;
			S2 = "hack";
			assert 1 <= S2.length() && S2.length() <= 50;
				for (int i = 0;i <= S2.length() - 1; ++i)
				{
					assert 'A' <= S2.charAt(i) && S2.charAt(i) <= 'Z' || 'a' <= S2.charAt(i) && S2.charAt(i) <= 'z';
				}
				System.out.println("enter the character Y or N");
			String str=sc.next();
			char C =str.charAt(0);
			System.out.println("enter the no between 0-50 according to string");
			I = sc.nextInt();
				assert C == 'Y' || C == 'N';
				assert 0 <= I && I < S1.length();
			if (C == 'N')
			{
				int x = S1.substring(I).indexOf(S2);
				if (x == -1)
				{
					System.out.print("Goodbye Watson.\n");
				}
				else
				{
					System.out.print(I + x);
					System.out.print("\n");
				}
			}
			else
			{
				S2 = " " + S2 + " ";
				S1 = " " + S1 + " ";
				int x = S1.substring(I).indexOf(S2);
				if (x == -1)
				{
					System.out.print("Goodbye Watson.\n");
				}
				else
				{
					System.out.print(I + x);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		TheHackNumber.Main();
	}
}