package com.qa.hackerrank;

public class PangramChecker {
//A pangram is a sentence containing every letter in the English Alphabet (a-z).
//Pangram example: The quick brown fox jumps over the lazy dog

    /*
    Approach:
Create a boolean array that can hold 26 boolean corresponding to each alphabet in English.
Traverse each character of the sentence and mark corresponding index (a=0, b=1,.. z=26) in the boolean array. Take care of upper and lower case.
Traverse through the entire boolean array and see if all characters are covered. If all positions are set to true then input sentence is a pangram.
     */

    public static boolean checkPangram(String S)
    {
         boolean[] mark = new boolean[26];
         int index = 0;

         for(int i = 0; i<S.length();i++)
         {
             if('A' <= S.charAt(i) && S.charAt(i)<='Z')
             {
                    index = S.charAt(i)- 'A';
             }
             else if('a'<=S.charAt(i) && S.charAt(i)<='z')
             {
                 index = S.charAt(i) - 'a';
             }
             mark[index] = true;

         }

         for(int i = 0; i<=25;i++)
         {
              if(!mark[i])
              {
                  return false;
              }
         }
          return true;
    }

    public static void main(String[] args) {

        String s = "he is raktim";
        System.out.println(checkPangram(s));

    }
}
