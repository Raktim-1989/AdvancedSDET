package com.qa.hackerrank;

import javax.script.ScriptException;
import java.util.Arrays;

public class DemoTest {

    public static int returnOut(String n) throws ScriptException {

        char[] arr = n.toCharArray();

        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        char s = arr[0];
        int value = Integer.parseInt(Character.toString(s));
        int sum = value;

        for(int i = 2 ; i<arr.length;i=i+2)
        {
            s = arr[i];
            value = Integer.parseInt(Character.toString(s));
            //Character.toString(arr[i]).charAt(i-1);
             char operator = arr[i-1];
             if(operator == '+')
             {
                 sum = sum + value;
             }
             else
             {
                 sum = sum - value;
             }




        }

return sum ;
    }

    public static void main(String[] args) throws ScriptException {

        System.out.println(returnOut("1+4-2"));

    }

}
