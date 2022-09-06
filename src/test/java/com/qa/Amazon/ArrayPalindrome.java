package com.qa.Amazon;

public class ArrayPalindrome {
/*

TC O(N) , SC O(N)
 */
    public static Boolean isPlaindromeArray(int[] arr , int n)
    {
        boolean flag = true;

        for(int i = 0; i<=n/2 && n!=0 ; i++)
        {
            if(arr[i] != arr[n-i-1])
            {
                flag = false;
                break;
            }
        }
        return flag;
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,2,1};
        int len = arr.length;
        System.out.println(isPlaindromeArray(arr , len));


    }
}
