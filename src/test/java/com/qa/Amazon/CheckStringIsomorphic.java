package com.qa.Amazon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckStringIsomorphic {

        public static boolean isIsomorphic(String s , String t)
        {
            if(s.length() != t.length())
            {
                return false;
            }

                 Map<Character , Character> map1 = new HashMap<Character , Character>();
                 Map<Character , Boolean> map2 = new HashMap<Character , Boolean>();
                 for(int i = 0 ; i<s.length();i++)
                 {
                        char c1 = s.charAt(i);
                        char c2 = t.charAt(i);

                        if(map1.containsKey(c1))
                        {
                             if(map1.get(c1) != c2)
                             {
                                 return false;
                             }
                        }
                        else
                        {
                            if(map2.containsKey(c2))
                            {
                                return false;
                            }
                            else
                            {
                                map1.put(c1 , c2);
                                map2.put(c2 , true);
                            }
                        }

                 }


            return true;

        }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(isIsomorphic(A , B));




    }
}
