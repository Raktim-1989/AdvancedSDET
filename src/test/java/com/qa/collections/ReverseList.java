package com.qa.collections;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(5);
        list.add(200);

        Collections.reverse(list);
        System.out.println(list);

        for(int i : list)
        {
            System.out.println(i);
        }
    }
}
