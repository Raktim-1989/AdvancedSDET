package com.qa.programming.oops;

import java.util.ArrayList;

public class StudentHighestMarks {

    public static void main(String[] args) {

        Student s1 = new Student("Tom", 1,90,15);
        Student s2 = new Student("Greg", 3,80,19);
        Student s3 = new Student("Roy", 2,60,22);
        Student s4 = new Student("Taylor", 4,95,21);
        Student s5 = new Student("Williamson", 5,40,35);

        //add all the objects in array-list
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        System.out.println("student size "  + list.size());

        //Iterate all students


        System.out.println(list);
        int highest =0;
        String name = null;
        for (Student s : list)
        {
            if(s.getMarks() > highest)
            {
                highest = s.getMarks();
                name = s.getName();
            }

        }
        System.out.println("highest mark is " +  highest + "  & name is " + ":" + name);




    }
}
