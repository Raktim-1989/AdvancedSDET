package com.qa.collections;

import java.util.*;

/*
Virtual Capacity Concept
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Object> ar = new ArrayList<Object>();
        //by default it will be divided into 10 equal parts by default
        //VC = 10 , PC = 0 (Physical capacity)
        System.out.println(ar.size()); //it will calculate based on PC

        ar.addAll(Arrays.asList(1,2,33,44,55));
        System.out.println(ar);
        ar.clear();
        System.out.println(ar);

        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.addAll(Arrays.asList("Python", "C#", "DevOps", "Java"));
        ar2.addAll(Arrays.asList(new String[]{"Mockito", "WebDriverIO"}));
        ArrayList<String> arClone = (ArrayList<String>) ar2.clone();
        System.out.println(arClone);

        System.out.println(arClone.indexOf("Devops"));
        //from arClone object, remove devops
        arClone.removeIf(course -> course.equals("DevOps"));
        System.out.println("courseList after removal" + arClone);
        //singleTon object
        Set<String> ls = Collections.singleton("Rishi");
        System.out.println(ls);
        System.out.println(arClone.contains("DevOps"));

        //How to syncronize ArrayList
        /*
        1. Collections.synchronizedList()
        2.copyOnWriteArrayList()
         */

        List<String> syncList = Collections.synchronizedList(new ArrayList<String>());

    }
}
