package com.qa.Amazon;

import java.util.Scanner;

public class MaximumOccuringChar {

    /*

    Maximum occuring character frequency in a string
   String n =  "aabbcccccdsd"
   occurance is   5
     */

    public static void getMaximumCharacter(String s)
    {
               int[] arr = new int[256];
               for(int i = 0 ; i<s.length();i++)
               {
                   arr[s.charAt(i)] = arr[s.charAt(i)] + 1;
               }

               int max = -1;
               char c = ' ';
               for(int i = 0 ; i<s.length() ; i++)
               {
                   if(max <= arr[s.charAt(i)])
                   {
                          max = arr[s.charAt(i)];
                          c = s.charAt(i);

                   }

               }
               if(max == 1)
               {
                   System.out.println("All   characters are same length !!");

               }

       System.out.println("occurance is   " + max);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        getMaximumCharacter(A);
    }
}
