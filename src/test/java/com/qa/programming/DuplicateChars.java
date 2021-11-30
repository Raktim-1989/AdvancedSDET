package com.qa.programming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateChars {

    public  static void printDuplicateCharacters(String sh)
    {
        if(sh == null)
        {
            System.out.println("Return null .....");
            return ;
        }
        if(sh.isEmpty())
        {
            System.out.println("Empty String");
            return;
        }
        if(sh.length() == 1)
        {
            System.out.println("Single character String");
            return;
        }
        //main logic
        char[] array=  sh.toCharArray();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        System.out.println(map);
        for(char c : array)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }
        }

       Set set = map.entrySet();
       Iterator itr =  set.iterator();
       while(itr.hasNext())
       {
           Map.Entry<Character,Integer> entry = (Map.Entry<Character,Integer>)itr.next();
           System.out.println(entry.getKey() + ": " + entry.getValue());
       }
    }


    public static void main(String[] args) {

        printDuplicateCharacters("raktimlearnsjava");
       printDuplicateCharacters("");
        printDuplicateCharacters(null);
        printDuplicateCharacters("1");


    }


}
