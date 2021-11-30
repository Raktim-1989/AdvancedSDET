package com.qa.concepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListItr {
    public static void main(String[] args) {
        ArrayList<String> course = new ArrayList<String>();
        course.add("Java");
        course.add("python");
        course.add("devops");

        //1. iterator concept
        Iterator<String> itr = course.iterator();
        while(itr.hasNext())
        {
           String cr =  itr.next();
            System.out.println(cr);
        }
        System.out.println("*************");

        //2. forEachRemaining
        itr = course.iterator();
        itr.forEachRemaining(cr ->{
            System.out.println(cr);
                });
        System.out.println("************");

        //3.using foreach loop
        for(String s : course)
        {
            System.out.println(s);
        }

        System.out.println("*********");

        //4.using for loop
        for(int i = 0; i<course.size();i++)
        {
            System.out.println(course.get(i));
        }

        System.out.println("**********");

        //5.using listIterator() and traverse both directions
        ListIterator<String> listIterator = course.listIterator(course.size());
        while(listIterator.hasPrevious())
        {
            String vl = listIterator.previous();
            System.out.println(vl);
        }



    }
}
