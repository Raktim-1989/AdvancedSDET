package com.qa.programming.oops;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        Map<Employee,String> map = new HashMap<Employee,String>();
        Employee e1 = new Employee("Raktim", 30);
        map.put(e1,"Hike !!!");
        System.out.println(map.get(e1));

        Map<String,Integer> map1 = new HashMap<String,Integer>();
       // System.out.println(map1.get("Tom")); //show 100

        String e11 = "Tom";
        map1.put(e11, 100); //A new hashcode is generated and since String is immutable, Tom will be stored with value 100
        //map1.put(e11,200);
        System.out.println(map1.get(e11)); //200
        //System.out.println(map1.get("Tom"));

        e11= "Sarkar";
        map1.put(e11,200);
        System.out.println(map1.get(e11));
        System.out.println(map1.get("Tom"));  //it will go to cache and will check te hashcode of tom and will return 100



    }
}
