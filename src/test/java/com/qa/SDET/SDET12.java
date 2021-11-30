package com.qa.SDET;

public class SDET12 {
    //Write a java program to count the total number
    // of occurrences of a given character in a string without using any loop
    public static String removeWhiteSpaces(String input)
    {
        StringBuilder sb = new StringBuilder();
        char[] arr = input.toCharArray();
        for(char c : arr) {
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String s = "Java is java again java again";
        char c = 'a';

        int count = s.length() - s.replaceAll("a","").length();
        System.out.println(count);
       // System.out.println(removeWhiteSpaces("Raktim    Sarkar"));
        String s1 = removeWhiteSpaces("Raktim   Sarkar");
        System.out.println(s1);

    }
}
