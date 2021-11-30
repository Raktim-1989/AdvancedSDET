package com.qa.programming;

/*
Check subString is present in a given string
 */
public class SubString {

    public static  boolean isStringPresent(String main, String sub)
    {

        return main.matches("(.*)" + sub + "(.*)");
    }

    public static void main(String[] args) {
        System.out.println(isStringPresent("Raktim devops eng", "devops"));
        System.out.println(isStringPresent(" devops eng", "dev"));
        System.out.println(isStringPresent("#@$$ devops eng", "$"));
        System.out.println(isStringPresent("devops eng", "m"));
    }
}
