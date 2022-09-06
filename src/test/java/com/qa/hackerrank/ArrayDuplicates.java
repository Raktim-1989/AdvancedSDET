package com.qa.hackerrank;

import java.util.*;

public class ArrayDuplicates {
    public static void getArray() {
        int[] arr = {1,22,22,3,4,55,55,67,1};
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        for(Integer a : arr)
        {
            if(map.containsKey(a))
            {
                map.put(a,map.get(a) +1);
            }
            else
            {
                map.put(a, 1);
            }
        }

        Set set = map.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            Map.Entry<Integer,Integer> entry = (Map.Entry<Integer,Integer>) itr.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static void getNewArray()
    {
           int[] arr = {1,22,22,32,32,45,67,99,1,45};
           Set<Integer> set = new HashSet<Integer>();
           for(int i = 0; i<arr.length;i++)
           {
               for(int j = i+1;j<arr.length;j++)
               {
                   if(arr[i] == arr[j])
                   {
                       set.add(arr[i]);
                   }
               }
           }

           List<Integer> list = new ArrayList<Integer>(set);
           Object[] newArray = list.toArray();
        System.out.println(Arrays.toString(newArray));

    }


    public static void main(String[] args) {
   //getArray();
   getNewArray();
    }
}
