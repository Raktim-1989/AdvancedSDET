package com.qa.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String,String> course = new HashMap<String,String>();
        course.put("Oracle", "Java");
        course.put("MS", ".excel");
        course.put("Mozilla", "excel");
        course.put("Oracle", "AWS");

        Set set = course.keySet();
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            String keys = (String) itr.next();
            String values = course.get(keys);
            System.out.println(keys + " : " + values);
        }
    }
}
