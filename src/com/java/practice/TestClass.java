package com.java.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         String s = br.readLine();

         String out_ = Palindromic_Subsequence(s);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static String Palindromic_Subsequence(String s){
		return s;
        // Your code goes here
    
    }
}