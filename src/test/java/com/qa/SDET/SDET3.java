package com.qa.SDET;

import java.util.*;

//How to find duplicate element in Array?
public class SDET3 {

    public static Object[] getDuplicates(int[] arr)
    {

        Set<Integer> set = new HashSet<Integer>();

      for(int i = 0; i< arr.length;i++)
      {
          for(int j = i+1;j<arr.length;j++)
          {
              if(arr[i] == arr[j])
              {
                  set.add(arr[i]);

              }
          }
      }

        System.out.println(set);
        List<Integer> list = new ArrayList<Integer>(set);
       Object[] duplicates =  list.toArray();
        return duplicates;

    }
    public static void main(String[] args) {
       Object[] ds =  getDuplicates(new int[]{1,2,2,44,2,55,67});
        System.out.println(Arrays.toString(ds));
    }
}
