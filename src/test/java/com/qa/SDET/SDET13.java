package com.qa.SDET;

import java.util.*;

public class SDET13 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("D",1);
        map.put("C",1);
        map.put("A",1);
        map.put("B",1);

        Map<String,Integer> map1 = new TreeMap<String,Integer>(Collections.reverseOrder());
        map1.put("D",1);
        map1.put("C",1);
        map1.put("A",1);
        map1.put("B",1);
        Set set = map1.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext())
        {
           Map.Entry entry = (Map.Entry) itr.next();
           System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
