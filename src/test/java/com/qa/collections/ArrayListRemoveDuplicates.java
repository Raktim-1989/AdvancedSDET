package com.qa.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayListRemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,2,55,34,34,21,0,78,9,0));
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(list);

        ArrayList<Integer> listAfterDuplicates =  new ArrayList<Integer>(set);
        System.out.println(listAfterDuplicates);


    }
}
