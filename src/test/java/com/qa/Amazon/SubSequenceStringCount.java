package com.qa.Amazon;

import java.util.Scanner;

public class SubSequenceStringCount {

     public static int count(String S1 , String S2)
     {
           int m = S1.length();
           int n = S2.length();

           //creating a lookup table
            int[][] lookup = new int[m+1][n+1];
           //If S1 is empty
           for(int i = 0 ;i <=n;i++)
           {
                lookup[0][i] = 0;
           }

           //if S2 is empty
         for(int j = 0 ; j<=m;j++)
         {
             lookup[j][0] = 1;
         }
         //main logic
         for(int i = 1 ; i<=m;i++)
         {
             for(int j = 1 ; j<=n;j++)
             {
                   if(S1.charAt(i-1) == S2.charAt(j-1))
                   {
                       lookup[i][j] = lookup[i-1][j-1] + lookup[i-1][j];
                   }
                   else
                   {
                       lookup[i][j] = lookup[i-1][j];
                   }
             }
         }

         return lookup[m][n];

     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(count(A , B));

    }
}
