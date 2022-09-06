package com.qa.Amazon;

import java.util.Arrays;
import java.util.Scanner;

public class CheckStringPangram {

    /*
     TC - O(N)   SC O(26)
     */

    public static boolean isStringPangram(String S) {
        S = S.replaceAll(" ", "");
        System.out.println(S);
        int[] A = new int[26];
        char[] array = S.toCharArray();
        int size = array.length;
        int index =  0;
        for(int i = 0 ; i<S.length();i++)
        {
              if(S.charAt(i) >='a' && S.charAt(i) <='z')
              {
                   index = S.charAt(i) - 'a';
                  System.out.println("index is   " + index);
              }
              else if (S.charAt(i) >='A' && S.charAt(i)<='Z')
              {
                  index = S.charAt(i) - 'A';
                  System.out.println(index);
              }

              A[index] = 1;
        }

       for(int a : A)
       {
           System.out.println(a);
       }
        for(int i = 0; i<26;i++)
        {
            if(A[i] != 1)
            {

                return false;
            }

        }

        return true;
    }





    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        String A = sc.next();
        System.out.println(isStringPangram(A));


    }
}
