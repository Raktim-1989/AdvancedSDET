package com.qa.SDET;

public class SDET7 {
//remove spaces in between words from String
    public static void main(String[] args) {
        String s = "Raktim           Sarkar";
       s =  s.replaceAll("\\s", "");

        System.out.println(s);
    }
}
