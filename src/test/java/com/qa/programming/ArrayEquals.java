package com.qa.programming;

import org.testng.Assert;

import java.util.Arrays;

public class ArrayEquals {

    public static void getArrayEquals(int[] a1, int[] a2)
    {
        Boolean flag = Arrays.equals(a1,a2);
        Assert.assertTrue(flag);
        //return flag;
    }

    public static void getArrayLogic()
    {
        int[] arr1 = {2,44,55,66};
        int[] arr2 = {2,44,55,66};
        Boolean flag = true;
        if(arr1.length == arr2.length)
        {
            for(int i =0;i<arr1.length;i++)
            {
                if(arr1[i] != arr2[i])
                {
                    flag = false;
                }
            }
        }

        Assert.assertTrue(flag);
    }

    public static void main(String[] args) {

        getArrayEquals(new int[]{2, 4, 5, 7}, new int[]{2, 4, 5, 7});
        getArrayLogic();

    }
}
