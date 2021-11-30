package com.qa.collections;

import java.util.*;

public class SortedMap {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("Oracle",1);
        map.put("CTS",4);
        map.put("Amazon",2);
        map.put("MS",3);
        map.put("TCS",5);

       Map<String,Integer> sortedMap =  new TreeMap<String,Integer>(map);
       Set set = sortedMap.entrySet();
       Iterator itr = set.iterator();
       while(itr.hasNext())
       {
           Map.Entry<String,Integer> entry =  (Map.Entry<String,Integer>) itr.next();
           System.out.println(entry.getKey() + ": " + entry.getValue());

       }


    }
}
