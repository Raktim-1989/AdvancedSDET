package com.qa.Amazon;

import java.util.Scanner;

public class CountVowlesConsonant {

    public static void getCounts(String str)

    {

        int vowels = 0 , consonants = 0 , digits  = 0 , specialChars = 0;
//        str = str.replaceAll("\\s" , "");
//        System.out.println(str);
        System.out.println(str.length());
            for(int i = 0; i <str.length();i++)

            {
                char c = str.charAt(i);
                //vowles & consonants checking
                if((c >= 'a' && c <= 'z') || (c >='A' && c<='Z')) {
                    c = Character.toLowerCase(c);

                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        vowels++;
                    }
                    else
                    {
                        consonants ++;
                    }

                }
                //numerics checkings
                else if(c >= '0' && c <= '9')
                {
                     digits ++;
                }
                else
                {
                    specialChars ++;
                }

 }
        System.out.println("Vowels  " + vowels);
        System.out.println("Consonants  " + consonants);
        System.out.println("digits  " + digits);
        System.out.println("special_characters   " + specialChars);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String A = sc.next();

        getCounts(A);
    }
}
