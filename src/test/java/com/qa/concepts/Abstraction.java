package com.qa.concepts;
abstract  class Bank
{
      int rate = 10;

    static double price = 20.00;
    public void loan()
    {
        System.out.println("bank loan invoked");
        rate = 11;
    }
    public abstract void credit();
    public  abstract  void debit();

}

   class HDFC extends Bank
{
 @Override
    public void credit() {
     System.out.println("credit ... service for HDFC invoked");
    }

    @Override
    public void debit() {
        System.out.println( "debit ..service for HDFC invoked");
    }

    public void funds()
    {
        System.out.println("funds HDFC invoked");
    }

}

class Citi extends Bank
{
    @Override
    public void credit() {
        System.out.println("credit ... service for CITI invoked");
    }
    @Override
    public void debit() {
        System.out.println("credit ... service for CITI invoked");
    }
}

public class Abstraction  {

    public static void main(String[] args) {
          HDFC hd = new HDFC();
          hd.debit();
          hd.credit();
          hd.funds();
        System.out.println("*********************");

          Bank b = new HDFC();
          b.credit();
          b.debit();
          //ban won't be able to access funds(0 since this is HDFC restricted
         }


}
