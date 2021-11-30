package com.qa.hackerrank;

import java.util.Arrays;

public class ArraySorting {

    public static int[] arraySort(int[] array)
    {
        int temp ;
        for(int i = 0; i<array.length;i++)
        {
            for(int j = i+1;j<array.length;j++)
            {
                if(array[i] < array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }

        return array;
    }
    public static void main(String[] args) {

       int[] sortedArrayDescending =  arraySort(new int[]{33,1,56,123,2,567,0});
        System.out.println(Arrays.toString(sortedArrayDescending));
        Arrays.sort(sortedArrayDescending);
        System.out.println("*********************");

        System.out.println(Arrays.toString(sortedArrayDescending));
    }
}
