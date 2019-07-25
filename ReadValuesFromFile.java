package com.java.practice;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadValuesFromFile {
	public static void main(String[] args) throws Exception {
		// pass the path to the file as a parameter
		File file = new File("C:\\Users\\Shaik\\Desktop\\testcases\\input.txt");
		Scanner sc = new Scanner(file);
		ArrayList<Integer> al=new ArrayList<>();
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			al.add(sc.nextInt());
			System.out.print(al);
	}
		

}
}


