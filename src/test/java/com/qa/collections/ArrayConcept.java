package com.qa.collections;

import java.util.Arrays;

public class ArrayConcept {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,710};

        //conventional for loop
        for(int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("--------------------");
        //for-each loop
        for(int i:arr)
        {
            System.out.println(i);
        }
        System.out.println("--------------");
        //Arrays in java
        Arrays.toString(arr);

        System.out.println("1");
        System.out.println(1);

        //WAP to print 2nd largest elemnet in an array
        //int[] arr1 = P{1,22,56,0,9877} // 56  //a[1]

    }
}
