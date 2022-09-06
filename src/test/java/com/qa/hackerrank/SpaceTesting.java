package com.qa.hackerrank;

public class SpaceTesting {

    public static void main(String[] args) {
        String name = " My name is           raktim";

        System.out.println(name.length());

        String[] arr = name.split(" +");
        System.out.println(arr.length);
        for(String s : arr)
        {
            System.out.println(s);
        }

    }
}
