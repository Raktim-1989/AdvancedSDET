package com.qa.hackerrank;

public class AdjacentArray {

    public static void main(String[] args) {
        int[] a = {1,4,8,15,17,-4};  //3,4,7,2
        int adjacent = 0;
        int diff = 0;
        for(int i = 0; i<a.length-1;i++)
        {
                diff = a[i+1] - a[i];
                if(diff > adjacent)
                {
                    adjacent = diff;
                }
            }


        System.out.println("largest adjacent value is  " + adjacent);

    }
}
