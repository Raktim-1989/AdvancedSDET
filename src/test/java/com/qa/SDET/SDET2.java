package com.qa.SDET;

import java.util.*;

//How to do sorting in HashMap? Use TreeMap
public class SDET2 {

    public  static Map<Integer,String> sortMap(Map<Integer,String> map)
    {
        map = new HashMap<Integer,String>();
        map.put(3,"Oracle");
        map.put(5,"Amazon");
        map.put(1,"Flipkart");
        map.put(4,null);

        Map<Integer,String> treeMap =  new TreeMap<Integer,String>(map);
        Set set= treeMap.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            Map.Entry<Integer,String> entry  = (Map.Entry<Integer,String>)itr.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        return treeMap;

    }
    public static void main(String[] args) {
        sortMap(new HashMap<Integer,String>());

    }
}
