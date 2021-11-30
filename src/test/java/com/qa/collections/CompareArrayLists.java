package com.qa.collections;

import java.util.*;

public class CompareArrayLists {
/*
sort and then equals
 */
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,5,7,8));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,33,4,5,6,7));
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1.equals(list2));
        Set<Integer> set =new HashSet<Integer>();
        set.addAll(list1);
        System.out.println("set elements are ");
        System.out.println(set);

        System.out.println("************");
        //retrieve the additional element : unique element
        list1.removeAll(list2);
        System.out.println(list1);

        //retrieve common elements : use retainAll()



    }
}
