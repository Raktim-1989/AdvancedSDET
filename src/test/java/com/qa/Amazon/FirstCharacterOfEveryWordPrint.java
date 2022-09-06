package com.qa.Amazon;


import java.util.Scanner;

public class FirstCharacterOfEveryWordPrint {

    public static void printFirstChars(String S)
    {
          char[] array = S.toCharArray();
        System.out.println(S);

        System.out.println(array.length);
          for(int i = 0 ; i<array.length;i++)

          {
              if(array[i] != ' ')
              {
                  if(i == 0)
                  {
                      System.out.println(array[i]);
                  }
                  else if (array[i-1] == ' ')
                  {
                      System.out.println(array[i]);
                  }
              }

          }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        String A  = sc.next();
        printFirstChars(A);

    }

}
