package com.qa.programming.oops;

class A
{
    void B()
    {
        System.out.println("accessed  !!");
    }
}
public class Inheritence extends A {
    public static void main(String[] args) {
        Inheritence obj = new Inheritence();
        obj.B();
    }
}
