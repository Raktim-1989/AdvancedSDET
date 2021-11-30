package com.qa.programming;

public class MissingNumberArray {

    public static int findMissingNumber(int[] arr , int totalCount)
    {
        int expTotal = totalCount* ((totalCount+1)/2);
        int actualSum  = 0;
        for(int a : arr)
        {
            actualSum = actualSum + a;
        }
        return (expTotal - actualSum);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        System.out.println(findMissingNumber(arr,5));

    }
}
