package com.qa.programming;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCommonElements {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.addAll(Arrays.asList(new Integer[]{22,11,34,55,78}));

        List<Integer> list2 = new ArrayList<Integer>();
        list2.addAll(Arrays.asList(new Integer[]{2, 11, 44, 55, 678}));

        List<Integer> list3 = new ArrayList<Integer>(list1);
        list3.retainAll(list2);
        System.out.println(list3);
    }
}
