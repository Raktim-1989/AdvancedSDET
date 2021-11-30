package com.qa.concepts;

public class TestOverload {

    public static void main(String[] args) {
        System.out.println("main method");
        main("raktim sarkar");
        main(3,4);
    }

    public static void main(String args)
    {
        System.out.println("main called" + args);
    }

    public static void main(int a, int b)
    {
        System.out.println(a + b);
    }

}
