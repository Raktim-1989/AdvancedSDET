package com.qa.SDET;

import java.util.Arrays;

//Find the second largest in an ARRAY?
public class SDET1 {

    public static int[] getArraySecondLargest(int[] arr)
    {
       // arr = new int[]{22,234,1,0,567,3,89};
        int k = 0;
        for(int i = 0; i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[i] < arr[j])
                {
                    k = arr[i];
                    arr[i] = arr[j];
                    arr[j] =k;
                }
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArraySecondLargest(new int[]{22,234,1,0,567,3,89})));
        int[] sortedArray =  getArraySecondLargest(new int[]{22,234,1,0,567,3,89});

        System.out.println("Second largest in array : "  + sortedArray[1]);
    }

}
