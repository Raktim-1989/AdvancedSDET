package com.qa.Amazon;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {
    /*
    TC -- O(N) , SC O(N)
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        int[] array1 = new int[length];
        int index = 0;

        for (int i = 0; i < length ; i++) {
            array[i] = sc.nextInt();
            //System.out.println(array[i]);
        }

        for(int i = array.length-1; i>=0;i--)
        {
           array1[index] = array[i];
           index
                   ++;
        }
        System.out.println(Arrays.toString(array1));
    }

}
