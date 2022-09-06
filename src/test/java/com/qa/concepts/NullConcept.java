package com.qa.concepts;

public class NullConcept {
    public void send()
    {
        System.out.println("send called ....");
    }
    public static void sum()
    {
        System.out.println("sum called .....");
    }

    public static void main(String[] args) {
        //1. default ref value is null
      // Integer i = null;
        //int j = i;   //here null value is assigned to a primitive data-type
        //System.out.println(j);

        //2. instanceOf operator
        Integer k = null;
        Integer l = 10;
        System.out.println(l instanceof Integer);
        System.out.println(k instanceof  Integer);

        //3.static vs non-static wrt null
        //static methods can be accessed by null reference variables which points to null objects
        NullConcept obj= null;
        //obj.send();  //null pointer exception will be thrown due to non-static send
        obj.sum();

        //4. ==  and  !=
        System.out.println(null == null);   //true
        System.out.println(null != null);   //false

        System.out.println("****************");

        //5.String concept in null
        String s1 = null;
        System.out.println(s1); //will return null as output
        String s2 = (String)null;
        System.out.println(s2);
        System.out.println(s2 + "raktimLab");
       // System.out.println(s2.length());   //action can't be performed and will fetch NullPointer exception






    }
}
