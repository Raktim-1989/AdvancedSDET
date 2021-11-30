package com.qa.concepts;

class Car
{
    public static void getStart()
    {
        System.out.println("get started");
    }
    public  void getStop()
    {
        System.out.println("car stopped");
    }
    public void getFuel()
    {
        System.out.println("car fueled");
    }
    //static method ca be overloaded
    public void getFuel(int k)
    {
        System.out.println("car fueled" + k);
    }

}
public class StaticOverRidingConcept extends  Car {

  //static methods can't be overridden so we can't use @Override
//This is a concept of method-hiding where parent class getStart() is invoked
    public static void getStart()
    {
        System.out.println("overridden start .....");
    }
    public static void main(String[] args) {
         StaticOverRidingConcept sr = new StaticOverRidingConcept();
         Car.getStart();
         sr.getFuel();
         sr.getFuel(2000);


    }

}
