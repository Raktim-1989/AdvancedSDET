package com.qa.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String,String> course = new HashMap<String,String>();
        course.put("Oracle", "Java" );
        course.put("MS", ".excel");
        course.put("Mozilla", "excel");
        course.put("Oracle", "AWS");

        course
                .remove("MS" , ".tt");

        Set set = course.keySet();
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            String keys = (String) itr.next();
            String values = course.get(keys);
            System.out.println(keys + " : " + values);
        }


        System.out.println("***********************");
        Set set1 = course.entrySet();
        Iterator itr1 = set1.iterator();
        while(itr1.hasNext())
        {
            Map.Entry<String,String> entry = (Map.Entry<String,String>) itr1.next();
            System.out.println(entry.getKey() + " -" + entry.getValue()) ;
        }

    }
}
