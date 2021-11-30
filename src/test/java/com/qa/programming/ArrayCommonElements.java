package com.qa.programming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayCommonElements {

    public static void main(String[] args) {
        int[] arr1 = {1,2,4,55,66,7};
        int[] arr2 = {2,4,55};

        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0;i<arr1.length;i++)
        {
            for(int j = 0;j<arr2.length;j++)
            {
                if(arr1[i] == arr2[j])
                {
                    set.add(arr1[i]);
                }
            }
        }

        System.out.println(set);


    }
}
