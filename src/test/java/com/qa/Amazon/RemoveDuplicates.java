package com.qa.Amazon;



import java.util.*;

public class RemoveDuplicates {

    public static String removeDuplicates(String s)
    {
        Map<Character , Integer> map = new LinkedHashMap<Character , Integer>();
        char[] array = s.toCharArray();
        for(char c : array)
        {
            if(map.containsKey(c))
            {
                map.put(c , map.get(c) + 1);
            }
            else
            {
                map.put(c , 1);
            }
        }

        Set set =  map.entrySet();
        Iterator itr = set.iterator();
        String res = "";
        while(itr.hasNext())
        {
           Map.Entry entry = (Map.Entry)itr.next();
           if((int)entry.getValue() == 1)
           {
               res = res + entry.getKey();

           }

        }

   return res ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(removeDuplicates(A));
    }
}
