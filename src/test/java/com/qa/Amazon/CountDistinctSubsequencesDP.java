package com.qa.Amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDistinctSubsequencesDP {

    public static int getDistinctCount(String s)
    {
              int[] dp = new int[s.length() + 1];
              dp[0] = 1;

        Map<Character , Integer> map  = new HashMap<Character , Integer>();
              for(int i = 1 ; i <dp.length ; i++)
              {
                  dp[i] = 2 * dp[i-1];
                  char c = s.charAt(i-1);
                  if(map.containsKey(c))
                  {
                        int j = map.get(c);
                        dp[i] = dp[i] - dp[j-1];
                  }

                  map.put(c , i);
              }
        System.out.println(Arrays.toString(dp));
        return dp[s.length()] -1;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(getDistinctCount(A));
    }


}
