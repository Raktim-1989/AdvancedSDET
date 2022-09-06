package com.qa.programming.oops;

 class Test {

     static {
         int age = 4;
         System.out.println(age);
     }
     public static final int roll = 12;

 }

 public class TestLocal
{
    public static void main(String[] args) {

      //  System.out.println(Test.roll);
        Test obj = new Test();

    }
}


