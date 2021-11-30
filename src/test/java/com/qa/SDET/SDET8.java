package com.qa.SDET;

import java.util.*;

public class SDET8 {
   // How to remove all duplicates from a given string?

    //Read more: https://www.java67.com/2018/04/21-string-programming-and-coding-interview-questions-answers.html#ixzz7C4OYzDg0
    public static void main(String[] args) {

        String s  = "Javaa";
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i<s.length();i++)
        {
            char c = s.charAt(i);
            if(!map.containsKey(c))
            {
                map.put(c,1);
            }
        }

        Set set = map.keySet();
        List<String> list = new ArrayList<String>(set);
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

    }
}
