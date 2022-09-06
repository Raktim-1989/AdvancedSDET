package com.qa.programming;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapInitialization {

    public static Map<String,Integer> map;
    static
    {
        map = new HashMap<String,Integer>();
        map.put("A",100);
        map.put("B",200);

        map.remove("A");
        System.out.println(map);
    }

    public static void main(String[] args) {

        System.out.println(HashMapInitialization.map);  //by using static block
        //by using singleton

        Map<String,Integer> mapTest = Collections.singletonMap("Test", 500);

        System.out.println(mapTest);

        //SingleTonMap creation
        Map<String,String> mapSingleTon = Map.of("K1", "V1");
        //mapSingleTon.put("K2", "V2");  //UnsupportedOperationException WILL BE THROWN
    }
}
