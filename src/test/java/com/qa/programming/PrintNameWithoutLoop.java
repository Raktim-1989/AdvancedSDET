package com.qa.programming;

//print your name 1000 times without using loop
public class PrintNameWithoutLoop {

    public static void main(String[] args) {
        String name = "Raktim";
        String s = "i";

       s =  s.replaceAll("i", "iiiiiiiiii");  //10 times
       s = s.replaceAll("i", "iiiiiiiiii");  //100 times
       s =  s.replaceAll("i", "iiiiiiiiii"); //1000 times

       s = s.replaceAll("i", name + "\n");
        System.out.println(s);
    }
}
