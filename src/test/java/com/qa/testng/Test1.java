package com.qa.testng;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.testng.annotations.Test;

public class Test1 {
    static {
        System.out.println("executed");
    }

    static void get() {
        System.out.println("get parent");
    }
}
   class A extends Test1{
       static void get() {
           System.out.println("get child ");
       }
    public static void main(String[] args) {
       A obj = new A();
       obj.get();

    }


}
