package com.qa.hackerrank;

class OuterClas

{
    private static String msg = "GeeksForGeeks";

     static class  NestedStaticClass
    {
          public void getMessage()
          {

              System.out.println("accessing from inner static class   " + msg);
          }
    }

      class InnnerClass
    {

        public  void getMessageNonstatic()
        {
            System.out.println("accessing from inner non static class   " + msg);
        }

    }

}



public class StaticClassConcept {

    public static void main(String[] args) {

        StaticClassConcept obj = new StaticClassConcept();
        OuterClas.NestedStaticClass obj1 = new OuterClas.NestedStaticClass();

        obj1.getMessage();
        OuterClas outer = new OuterClas();
        OuterClas.InnnerClass inner  = new OuterClas().new InnnerClass();
        inner.getMessageNonstatic();

    }
}
