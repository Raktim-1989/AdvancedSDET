package com.qa.Amazon;


public class MaximumSumOfConsecutiveElementsArray {
  //n - length of array
  //k - no of adjacent digits
    /*
       O(N) , O(N)
     */
    public static int getSumArray(int[] arr , int n , int k)
    {
                int sum_array = 0;

                if( n <k)
                {
                    return -1;
                }

                for(int i = 0; i<k;i++)
                {
                    sum_array = sum_array + arr[i];
                   // System.out.println(sum_array);

                }

              int  window_sum = sum_array;
                //window sliding technique
                for(int i = k;i<n;i++)
                {
                    window_sum = window_sum + arr[i] - arr[i-k];
                       sum_array = Math.max(sum_array , window_sum);
                }
                return sum_array;
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,6};
        int k = 3;
        int n = arr.length;

        System.out.println(getSumArray(arr , n , k));

    }

}
