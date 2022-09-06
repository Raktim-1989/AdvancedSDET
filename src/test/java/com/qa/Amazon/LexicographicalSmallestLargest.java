package com.qa.Amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LexicographicalSmallestLargest {

    /*
   String n =  geeksforgeeks  //lexicographically means not distinct
      int k = 3
o/p -> [eek, eek, eks, eks, for, gee, gee, ksf, org, rge, sfo]
o/p -> eek  / sfo
     */

       public static String getSmallestAndLargest(String s , int k)
       {
            String smallest = "";
            String largest = "";
           List<String> list = new ArrayList<String>();
                for(int i = 0 ; i<s.length()-k+1 ; i++)
                {
                    list.add(s.substring(i,i+k));
                }

           Collections.sort(list);
           System.out.println(list);
           smallest = list.get(0);
           largest = list.get(list.size()-1);

           return smallest + "  / "  + largest  ;

        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int k = sc.nextInt();
        System.out.println(getSmallestAndLargest(A ,k));

    }
}
