package com.qa.SDET;

public class SDET5 {
    //How to reverse a string without using function?

    public static String reverseString(String s)
    {
       String reverse = "";
       for(int i = s.length()-1;i>=0;i--)
       {
           reverse = reverse + s.charAt(i);
       }
        return reverse;
    }
    public static void main(String[] args) {
     String rvs=  reverseString("raktim");
        System.out.println(rvs);
    }
}
