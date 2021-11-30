package com.qa.programming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StringDuplicates {

    public static void main(String[] args) {

        String course = "JavaaDevopsDevelopment";
        char[] array = course.toCharArray();
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(char c : array)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }
        }

       Set set =  map.entrySet();
       Iterator itr =  set.iterator();
       while(itr.hasNext())
       {
          Map.Entry<Character,Integer> entry =  (Map.Entry<Character,Integer>) itr.next();
           System.out.println(entry.getKey() + " : " + entry.getValue());
       }


    }
}
