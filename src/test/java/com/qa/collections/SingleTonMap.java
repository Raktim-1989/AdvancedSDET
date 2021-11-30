package com.qa.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SingleTonMap {

    public static void main(String[] args) {
        Map<String,String> singleTon = Map.of("Raktim", "Sarkar");
        Set set = singleTon.keySet();
        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            String keys = (String) itr.next();
            System.out.println(keys);
        }
    }
}
