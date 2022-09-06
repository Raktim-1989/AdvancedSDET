package com.qa.Amazon;

import java.util.Scanner;

public class ExtractDigitsFromString {

    /*

    Time Complexity: O(N)
    Auxiliary Space: O(N)
     */

    public static int extractDigits(String s)
    {
        int sum = 0;
        String numbers = s.replaceAll("[^0-9]" , "");
       // System.out.println(numbers);
        int digits = Integer.parseInt(numbers);
        System.out.println(digits);
        int count = 0;
        //count of digits
//        while(digits>0)
//        {
//            digits = digits/10;
//            count ++;
//        }
//        System.out.println("**COUNT OF DIGITS ARE**" +   count);

        //sum of digits
        while(digits > 0) {
            sum = sum + digits%10;
            digits = digits/10;
            System.out.println("sum is "  +  sum);
        }
        return sum;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in).useDelimiter("\\n");
         String A = sc.next();
       int summation =   extractDigits(A);
        System.out.println(summation);
    }
}
