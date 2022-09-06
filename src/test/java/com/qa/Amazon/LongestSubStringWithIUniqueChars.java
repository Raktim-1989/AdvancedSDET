package com.qa.Amazon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
This program is to calculate the longest sub-string length with k-distinct characters
String str = "bccbababd";
int k = 2;
output -- 5 //babab //here 2 distinct characters a & b and length is max = 5
if k = 3 --- bccbabab //8
TC - O(N) , SC O(N)
 */
public class LongestSubStringWithIUniqueChars {

    public static int getLongestSubString(String s , int k)
    {

       int start,end;
       start=end=0;
       int maxLength = 0;

        Map<Character , Integer> map = new HashMap<Character , Integer>();

       while(end < s.length())
       {
           char currentChar = s.charAt(end);
           map.put(currentChar , map.getOrDefault(currentChar, 0) + 1);

          //window handling logic
          while(map.size() > k)
          {
               char charFromFront = s.charAt(start);
               map.put(charFromFront, map.get(charFromFront)-1);

               if(map.get(charFromFront) == 0)
               {
                   map.remove(charFromFront);
               }

               start ++;
          }
          maxLength =  Math.max(end-start + 1 , maxLength);
           end ++;
       }
      return maxLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int k = sc.nextInt();
        System.out.println(getLongestSubString(A , k));
  }
}
