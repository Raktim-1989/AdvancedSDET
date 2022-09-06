package com.qa.Amazon;

import java.util.Scanner;

public class ReverseIndividualWord {

    public static String reverseIndividualWord(String S )
    {
        String temp_str = "";
        String final_str = "";

        char[] array = S.toCharArray();
        for(int i = 0 ; i <array.length ;i++)
        {
            char c = S.charAt(i);
            if(c == ' ')
            {
                    final_str = final_str + temp_str + " ";
                    temp_str = "";
            }
            else
            {
                temp_str = c + temp_str;
            }

        }
        final_str = final_str + temp_str ;
                return final_str;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        String A = sc.next();
        System.out.println(reverseIndividualWord(A));

    }
}
