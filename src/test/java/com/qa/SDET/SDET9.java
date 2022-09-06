package com.qa.SDET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SDET9 {
    //Method to remove duplicates from array and replcae with zero

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4,1, 5};
        int[] newArr = new int[arr.length];
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<arr.length;i++)
        {
            if(!list.contains(arr[i]))
            {
                list.add(arr[i]);
                newArr[i] = arr[i] ;
            }

        }
        System.out.println(Arrays.toString(newArr));

    }
}
