package com.qa.hackerrank;

import java.util.Scanner;

public class HackerRank005 {
    //javaHackerRank Java String Tokens problem solution

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] tokens = s.split("[^a-zA-Z]");
        int noTokens = 0;

        System.out.println(tokens.length);
        for(int i = 0; i<tokens.length; ++i)
        {
            if(tokens[i].length() > 0)
            {
                    noTokens++;
            }
        }
        System.out.println(noTokens);

        for (int i = 0; i<tokens.length;++i)
        {
            if(tokens[i].length() > 0)
            {
                System.out.println(tokens[i]);
            }
        }

    }

}
