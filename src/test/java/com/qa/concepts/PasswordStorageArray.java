package com.qa.concepts;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class PasswordStorageArray {

    public static void main(String[] args) {
        char c[] = new char[]{'r', 'a', 'k', 't','i','m','1','2','3'};
        System.out.println("pwd is " + c);

        //masking the character array
        Arrays.fill(c,'*');
        for(int i = 0; i<c.length;i++)
        {
            System.out.print(c[i]);
        }



    }
}
