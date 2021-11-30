package com.qa.programming;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: " );
        String name = sc.next();
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        System.out.println("Enter your Gender: ");
        char gender = sc.next().charAt(0);
        System.out.println("Enter your phoneNo: ");
        Long phn = sc.nextLong();
        System.out.println("---------------------");
        System.out.println("Name: " + name);

    }
}
