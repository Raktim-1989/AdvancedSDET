package com.qa.programming;

public class PrintOneToHundred {

    public static void useWithoutNumber()
    {
        int one = 'a'/'a';
        String s1 = "..........";

        for(int i = one;i<=s1.length()*s1.length(); i++)
        {
            System.out.println(i);
        }

        System.out.println("**************");
    }

    public static void printNumber(int num)
    {
        if(num<=100)
        {
            System.out.println(num);
            num++;
            printNumber(num);
        }
    }

    public static void main(String[] args) {

printNumber(1);

    }
}
