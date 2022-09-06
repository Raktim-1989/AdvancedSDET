package com.qa.Amazon;

import java.util.Scanner;

public class StringTrim {

    public static void trimString(String S)
    {
        S = S.replaceAll("\\s" , "");
        System.out.println(S);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        String A = sc.next();
       trimString(A);

    }
}
