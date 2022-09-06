package com.qa.Amazon;

import java.util.*;

public class UniqueCharacterString {

      public static void getUniqueChars(String s)
    {
        Map<Character , Integer> map = new HashMap<Character , Integer>();
        char[] arr = s.toCharArray();
        for(char c : arr)
        {
            if(!map.containsKey(c))
            {
                map.put(c ,1 );
            }
            else
            {
                map.put(c , map.get(c)+1);
            }
        }

          Set set = map.entrySet();

        Iterator itr = set.iterator();
        while(itr.hasNext())
        {
            Map.Entry<Character , Integer> entry = (Map.Entry<Character, Integer>) itr.next();

            //System.out.println(entry.getKey() + " : "  + entry.getValue());
            System.out.println("map size is " + map.size());
            if(entry.getValue() == 1)
            {
                System.out.println("**UNIQUE CHARACTERS ARE     " +  entry.getKey());
            }
        }

    }

    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          String A = sc.next();
          getUniqueChars(A);

    }
}
