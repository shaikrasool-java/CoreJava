package com.java.practice;

import java.util.Scanner;

public class RemoveCharacterFromString {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.nextLine();
        System.out.println (removeCharInString(str,  'a'));
    }
    public static String removeCharInString 
                           (String str, char charToBeRemoved) {
        if (str == null)
            return "";
        StringBuilder strBuild = new StringBuilder ();
        for (int i = 0; i < str.length (); i++) {
            char ch = str.charAt (i);
            if (ch == charToBeRemoved)
                continue;
            strBuild.append (ch);
        }
        return strBuild.toString ();
    }
}