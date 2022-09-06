package com.qa.Amazon;

import java.util.Scanner;

public class CheckStringDigit {

    /*
    TC -- O(N)   , SC - O(N)
     */

    public static boolean isEmpty(CharSequence cs)
    {
       return cs == null || cs.length() ==0;
    }

    public static boolean isNumeric(CharSequence sc)
    {
          if(isEmpty(sc))
        {
            return false;
        }
          for(int i = 0 ; i<sc.length();i++)

          {
              char c = sc.charAt(i);
              if(c > '0' && c  < '9')
              {
                     return false;
              }
          }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(isNumeric(A));

    }


}
