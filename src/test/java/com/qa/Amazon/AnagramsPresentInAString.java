package com.qa.Amazon;


/*
This program is to find anagrams/permutation of a given string for a given pattern
String s = "bcdcbabcbd"
String p = "abc";
abc pattern- abc, acb , bac , bca , cab , cba
TC - , SC -

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramsPresentInAString {
    /*
     TC -- O(N+M) , SC - O(M)  //where N is the character present in string & M is the chasracter prsesnt in pattern
     */

    public static List<Integer> findAnagramStringIndex(String s , String p)
    {
      Map<Character,Integer> map = new HashMap<Character,Integer>();
      int matchedElement = 0;
      int count = 0;
      int start = 0;
      List<Integer> anagramStartingIndex = new ArrayList<Integer>();
      for(int i = 0 ; i<p.length();i++)
      {
          map.put(p.charAt(i) , map.getOrDefault(p.charAt(i),0)+1);
      }
      for(int i = 0 ;i <s.length();i++)
      {
          char charCurrent = s.charAt(i);
          if(map.containsKey(charCurrent))
          {
              map.put(charCurrent , map.get(charCurrent)-1);
              if(map.get(charCurrent) == 0)
              {
                  matchedElement ++;
              }
          }

          if(matchedElement == map.size())
          {
              count ++;
              //list.add(start);
              anagramStartingIndex.add(start);

          }

          if(i >= p.length()-1)
          {
               char startingIndex = s.charAt(start++);
               if(map.containsKey(startingIndex))
               {
                   if(map.get(startingIndex) == 0)
                   {
                       matchedElement --;
                   }

                   map.put(startingIndex , map.get(startingIndex)+1);
               }
          }
      }

      return anagramStartingIndex;
    }


    public static void main(String[] args) {
       List<Integer> list = findAnagramStringIndex("bcdcbabcbd", "abc");
        System.out.println(list);

    }
}
