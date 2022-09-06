package com.qa.Amazon;

import java.util.Locale;
import java.util.Scanner;

public class RemoveVowels {

    public  static void removeVowels(String s )
    {
       s =  s.toLowerCase();
        s = s.replaceAll("[aeiou]" , "");
        System.out.println("String after removing vowels are   " + s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        String A = sc.next();
        removeVowels(A);

    }
}
