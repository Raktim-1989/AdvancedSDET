package com.qa.hackerrank;

import java.util.Scanner;

public class HackerRank004 {

    public static boolean isAnagram(String s1 , String s2)
    {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
if(s1.length() == s2.length()) {

     int[] a = new int[256];
     int[] b = new int[256];

    for (int i = 0; i < s1.length(); i++)
    {
          a[(int)s1.charAt(i)] +=1;
          b[(int)s2.charAt(i)]  +=1;
    }

    for(int i = 0; i<256;i++)
    {
        if(a[i] != b[i])
        {
            return false;
        }
    }

return true;
}
else
{
    return false;
}
    }
    //Java Anagrams
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();
        boolean flag = isAnagram(s1,s2);
        System.out.println(flag?"Anagrams" : "Not Anagrams");

    }
}
