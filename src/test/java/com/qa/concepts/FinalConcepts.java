package com.qa.concepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FinalConcepts {

    public static int getList()
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for(int i = 0;i<10;i++)
        {
            list1.add(i);
            list1.remove(i-1);
        }
       return  list1.size();

    }


    public static int getSet()
    {
        Set<Short> set = new HashSet<Short>();
        for(short i = 0; i<20; i++)
        {
            set.add(i);
            set.remove(i-1);
        }

        return set.size();


    }

    public static void main(String[] args)
    {
        System.out.println(getList());
        System.out.println(getSet());


            }
}
