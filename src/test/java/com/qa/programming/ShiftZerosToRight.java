package com.qa.programming;

import java.util.Arrays;

public class ShiftZerosToRight {

    public static void main(String[] args) {

        int[] oldArray = {1,0,2,0,3,0,0,0};
        int[] newArray = new int[oldArray.length];
        int count = 0;
        for(int i : oldArray)
        {
            if(i != 0)
            {
                newArray[count] = i;
                count ++;
            }
        }
        System.out.println(Arrays.toString(newArray));

    }

}
