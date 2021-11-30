package com.qa.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysArrayListConversion {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,33,23,56,78};
        List<Integer> list= Arrays.asList(array);
        System.out.println(list);
        System.out.println("*************");

        List<String> list1 = new ArrayList<String>();
        list1.addAll(Arrays.asList(new String[]{"rahul", "virat", "robbie", "DK"}));
        Object[] players =  list1.toArray();
        for(Object p : players)
        {
            System.out.println(p);
        }



    }
}
