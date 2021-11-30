package com.qa.SDET;

import java.util.Arrays;

public class SDET4 {
    public static boolean isAnagram(String a , String b)
    {
        char[] aArray = a.toLowerCase().toCharArray();
        char[] bArray = b.toLowerCase().toCharArray();
        Arrays.sort(aArray);
        Arrays.sort(bArray);

        return Arrays.equals(aArray,bArray);
    }
    public static void main(String[] args) {

        boolean bet = isAnagram("aaabbbcdssdftramlwhfjfjgg", "walmart");
        System.out.println((bet) ? "Two strings are anagrams" : "Not Anagrams");

    }
}
