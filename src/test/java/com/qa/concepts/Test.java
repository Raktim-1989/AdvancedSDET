package com.qa.concepts;

class Car1
{
    public   void drive()
    {
        System.out.println("drive called");
    }
}

public class Test extends Car1{
    //method hiding
    public   void drive()
    {
        System.out.println("drive called in child");
    }

    public static void main(String[] args) {

       Car1 obj = new Test();
       obj.drive();

    }

}
