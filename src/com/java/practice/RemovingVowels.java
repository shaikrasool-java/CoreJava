package com.java.practice;
import java.util.Scanner;

public class RemovingVowels  {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        String s = "";
        System.out.println("Type a tweet: ");
        String input = sc.nextLine();
        int length = 5;
        int i = 0;
        boolean isNotVowel;
        boolean limitReached;

        for (char c : input.toCharArray()) {
            isNotVowel = "AEIOUaeiou".indexOf(c) == -1;
            limitReached = length <= i;

            if (limitReached) {
                break;
            } else if (isNotVowel) {
                s += c;
                i++;
            }
        }
        System.out.println(s);
    }
}