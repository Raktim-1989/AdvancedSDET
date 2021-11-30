package com.qa.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CompareHashMaps {

    public static void main(String[] args) {
        Map<Integer, String> map1Product = new HashMap<Integer,String>();
        map1Product.put(1,"Google");
        map1Product.put(2,"Walmart");
        map1Product.put(3,"Amazon");
        map1Product.put(null, "a");
        map1Product.put(null, "B");
        System.out.println(map1Product.get(null));


        Map<Integer, String> map1Service = new HashMap<Integer,String>();
        map1Service.put(1,"CTS");
        map1Service.put(2,"TCS");
        map1Service.put(3,"Sapient");

        Map<Integer, String> map1Combine = new HashMap<Integer,String>();
        map1Combine.put(1,"CTS");
        map1Combine.put(2,"TCS");
        map1Combine.put(3,"Sapient");
        map1Combine.put(4,"WFA");

        //comparison of map objects using .equals()
        System.out.println(map1Service.equals(map1Combine));

        //combine keys from both objects
        System.out.println("***********");
        Set<Integer> set = new HashSet<Integer>(map1Combine.keySet());
        set.addAll(map1Product.keySet());
        System.out.println(set);

        //remove all keys coming from mapiProduct
        set.removeAll(map1Product.keySet());
        System.out.println("******after removal ********");
        System.out.println(set);













    }
}
