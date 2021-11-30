package com.qa.programming.oops;

public class Student {

    private  String name;
    private int roll_no;
    private int marks;
    private int age;

    public Student(String name, int roll_no, int marks, int age) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public int getMarks() {
        return marks;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                ", marks=" + marks +
                ", age=" + age +
                '}';
    }
}
