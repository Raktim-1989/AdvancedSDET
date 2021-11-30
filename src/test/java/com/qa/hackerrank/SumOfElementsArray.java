package com.qa.hackerrank;

public class SumOfElementsArray {

    public static int sumArray(int[] array)
    {
         int sum = 0;
         for(int a : array)
         {
             sum = sum + a;
         }
        return sum;
    }

    public static void main(String[] args) {

        int[] a = {1,3,5,77,200};
        int sum = sumArray(a);
        System.out.println(sum);

    }
}
