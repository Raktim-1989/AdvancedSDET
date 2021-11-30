package com.qa.programming;

public class SwapNumbers {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int k ;
        k = a;
        a = b;
        b = k;
        System.out.println(a + " , " + b);

        System.out.println("--------------");
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println(a + " , " + b);


    }
}
