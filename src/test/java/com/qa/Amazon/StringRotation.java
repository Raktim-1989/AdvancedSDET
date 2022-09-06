package com.qa.Amazon;

public class StringRotation {

    /*
    TC - O(N*N)
     */

    public static boolean isRotationString(String orgString , String keyString) {
        boolean flag = false;
        if (orgString.length() == keyString.length()) {
            String newString = orgString.concat(orgString);

            if (newString.contains(keyString)) {
                flag = true;
            }


        }
        return flag;
    }


    public static void main(String[] args) {

        System.out.println(isRotationString("ARADHYA"  , "RADHYAA"));

    }
}
