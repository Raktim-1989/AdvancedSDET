package com.qa.concepts;

public class NullArgument {

    //pass null argument with method overloading with String & Object types

    public static void test(String s)
    {
        System.out.println("String invoked");
    }

    public static void test(Object o)
    {
        System.out.println("Object invoked");
    }


    public static void main(String[] args) {

        test(null);

    }
}
