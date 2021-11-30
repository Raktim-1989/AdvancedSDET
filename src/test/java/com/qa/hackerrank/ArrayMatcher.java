package com.qa.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMatcher {


    public  static Object[] matchArrayElements(int[] a , int[] b)
    {
          List<Integer> list = new ArrayList<Integer>();
          int index = 0;
          if(a.length == b.length) {
              for (int i = 0; i < a.length; i++) {
                      if(a[i] ==  b[i])
                      {
                          list.add(a[i]);
                      }

              }
          }

         Object[] newArray=  list.toArray();
return newArray;
    }
    public static void main(String[] args) {

        Object[] arr =  matchArrayElements(new int[]{1,22,45,67} , new int[]{1,22,67,3});
        System.out.println(Arrays.toString(arr));

    }
}
