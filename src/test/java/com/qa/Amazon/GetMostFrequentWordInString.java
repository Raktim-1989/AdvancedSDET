package com.qa.Amazon;

import java.util.*;

public class GetMostFrequentWordInString {
/*
. 1)This will sort the map based on value
  2)If both of the entry values are same then it will sort with alphabentica order e.g. ajax: 2 will appear before than name;2
  3) This program will fetch the most frequent words in the string , if words are having same frequency then it will sort via aplhabetical order
  4) example: java:5 , ajax:2 , name:2 , raktim:2 , call:1 , is:1, my:1

 */

    public static void main(String[] args) {

        String name = "My Name.$$$   Name   is??   Java  Java Java Java Java Raktim  Raktim  Ajax Ajax call";
        name = name.replaceAll("[^a-zA-Z0-9]" , " ");
        System.out.println(name);
        String[] arr = name.split(" +");
        Map<String , Integer> map = new HashMap<String , Integer>();
        int max = 1;

        for(String s : arr)
        {
            s = s.toLowerCase();
            map.put(s  , map.getOrDefault(s,0)+1);
        }

     //sorting the map with comparator interface
        TreeMap<String, Integer> mostFrequentMap = new TreeMap<String, Integer>((e1 , e2) ->
        {
            int freq1 = map.get(e1);
            int freq2 = map.get(e2);

            if(freq1 != freq2)
            {
                 return freq2 - freq1;
            }

            return e1.compareTo(e2);
        });

        mostFrequentMap.putAll(map);

        Set set = mostFrequentMap.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>)itr.next();
            System.out.println(entry.getKey()   +  " : " + entry.getValue());
            if(max <= entry.getValue())
            {
                max = entry.getValue();
                System.out.println("get most few chars   "  + entry.getKey());
            }

        }
    }
}
