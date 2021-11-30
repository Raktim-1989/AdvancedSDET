package com.qa.programming;

public class IntegerComparison {
 //Compare two Integers
    //Integer caching both are auto-boxed
    //caching range -128 to 127
    //both numbers will be autoboxed then will compare
    public static void main(String[] args) {

        Integer num1 = 1001;
        Integer num2 = 1001;

        if(num1 == num2)
        {
            System.out.println("numbers matched");
        }
        else
        {
            System.out.println("Numbers not matched");
        }


    }
}
