package com.qa.concepts;
class TestBase
{
    static  int i = 10;
    static
    {
        StaticBlocks2 obj = new StaticBlocks2();
        System.out.println("raktim called");
        //System.out.println(obj.name = "Raktim");
    }
}
public class StaticBlocks2 {

    //for final variable static blocks won't get executed in other class


    public static void main(String[] args) {

        System.out.println(TestBase.i);

    }



}
