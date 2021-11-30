package com.qa.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDuplicates {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.addAll(Arrays.asList(new Integer[]{1,22,33,55,67}));

        Set<Integer> set2 = new HashSet<Integer>();
        set2.addAll(Arrays.asList(22,33));

        Set<Integer> set3 = new HashSet<Integer>(set1);
        set3.removeAll(set2);

        System.out.println(set3);




    }
}
