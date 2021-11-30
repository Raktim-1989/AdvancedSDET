package com.qa.concepts;

public class StaticBlocks
{
    public static void main(String[] args) {
        Base.get();
    }

}
 class Base {
    private Base()
    {
        System.out.println("private constructor invoked .......");
    }

     public static void get()
     {
         System.out.println("task called");
             Base obj = new Base();
     }

}
