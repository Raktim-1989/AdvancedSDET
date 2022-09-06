package com.qa.Amazon;

import java.util.Arrays;
import java.util.Scanner;

public class SegregatePositiveNegativeArray {

    public static void segregateArray(int[] arr , int n )
    {
        int i = 0;
        int j = n-1;
        int k = 0;

        while(true)
        {
            if(arr[i] < 0 && i <j)
            {
                i++;
            }
            else if (arr[j] > 0 && i < j)
            {
                j--;
            }

            if(i < j)
            {
                k = arr[i];
                arr[i] = arr[j];
                arr[j] = k;
            }
            else
            {
                break;
            }

        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
       // int[] arr = new int[arr.length];

        segregateArray(new int[]{-89,766,-100,0,87,-66}, 6);
    }
}
