package com.java.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class CountOccurence
{
    public static void main(String[] args)
    {
        //Input Array
    	ArrayList<Integer> a = new ArrayList<Integer>();

		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {

				a.add(sc.nextInt());
			}

		}
	//	int[] input = new int[]{ 1,4,5,2,3,5,1,6,4,7,1,3,6,8,2,5};

        //countMap holds the count details of each element
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.size(); i++)
        {
            int key =a.get(i);
            if (countMap.containsKey(key))
            {
                int count = countMap.get(key);
                count++;
                countMap.put(key, count);
            } else
            {
                countMap.put(key, 1);
            }
        }
      
        //Printing the Element and its occurrence in the array
        for(Entry<Integer,Integer> val : countMap.entrySet())
        {
            System.out.println(val.getKey() + " occurs " + val.getValue() + " time(s)");
        }
    }
}
