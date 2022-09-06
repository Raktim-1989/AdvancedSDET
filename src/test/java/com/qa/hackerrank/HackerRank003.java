package com.qa.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HackerRank003 {
    //HackerRank java substring comparisons problem solution.- Lexicographical Order
    public  static String getSmallestAndLargest(String s, int k)
    {
        String smallest = "";
        String largest = "";

        List<String> list = new ArrayList<String>();

        for(int i = 0; i<s.length()-k+1;i++)
        {
            list.add(s.substring(i,i+k));
        }
        System.out.println(list);
        Collections.sort(list);
        smallest = list.get(0);
        largest = list.get(list.size()-1);

        return smallest + "\n" + largest;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String s =  sc.next();
       int k = sc.nextInt();
        System.out.println(getSmallestAndLargest(s,k));

    }
}
