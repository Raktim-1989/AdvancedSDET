package com.qa.concepts;

public interface BankingTest {

    //in interface the variables are static & final by default
    int rate = 2;    //default this is final & static
    public  void getSavings();
    public void geDebit();
    public void getLoan();

    class ICICI implements BankingTest
    {

        @Override
        public void getSavings() {

        }

        @Override
        public void geDebit() {

        }

        @Override
        public void getLoan() {

        }
    }

    public static void main(String[] args) {

        System.out.println(rate);
    }

}
