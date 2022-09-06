package com.qa.Amazon;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringContainsAnagram {

    public static int isAnagramPresentInString(String s , String p)
    {

        if(s == null || s.length()==0 || p == null || p.length()     ==0)
        {
            //return false;
        }

        Map<Character , Integer> map = new HashMap<Character , Integer>();
        for(int i = 0 ; i<p.length();i++)
        {
            map.put(p.charAt(i) , map.getOrDefault(p.charAt(i),0) + 1);
        }

        int matchedElement = 0;
        int start = 0;
        int output = 0;

        for(int i = 0 ; i<s.length();i++)
        {
            char currentChar = s.charAt(i);
            if(map.containsKey(currentChar)) {
                map.put(currentChar, map.get(currentChar) - 1);
                if (map.get(currentChar) == 0) {
                    matchedElement++;
                }
            }
                if(matchedElement == map.size())
                {
                    output ++;
                    System.out.println(output +  " for index  "  + i);
                    //return true;
                }

                if(i >= p.length()-1)
                {
                   // System.out.println(i);
                    char charAtStart = s.charAt(start++);
                    if(map.containsKey(charAtStart))
                    {
                        if(map.get(charAtStart) == 0 )
                        {
                            matchedElement --;
                        }
                        map.put(charAtStart , map.get(charAtStart) + 1);
                    }
                }
            }

     //return false;
        return output;
    }
    public static void main(String[] args) {

        System.out.println(isAnagramPresentInString("cbabcacabca" , "acb"));
    }

}
