package com.qa.Amazon;

import java.util.Arrays;
import java.util.Scanner;

public class CheckStringsAnagram {
    /*
    TC --- O(NlogN)
    Space Complexity: O(n)
     */

    public static boolean isStringsAnagrams(String s1 , String s2)
    {
        String str1 = s1.replaceAll("\\s" , "");
        String str2 = s2.replaceAll("\\s" , "");
        if(str1.length() != str2
                .length())
        {
            return false;
        }
        char[] c1 = str1.toLowerCase().toCharArray();
        char[] c2 = str2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1 , c2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A  = sc.next();
        String B = sc.next();
        boolean flag = isStringsAnagrams(A , B);
        System.out.println(flag);

    }
}
