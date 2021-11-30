package com.qa.programming.oops;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysJoin {

    public static void main(String[] args) {
        String[] batsman = {"Virat", "Rahul","rohit","hardik","pant"};
        String[] bowler = {"Bumrah","Shami","Bhuvi","Jaddu"};

        Stream<String> sBatsman = Arrays.stream(batsman);
        Stream<String> sBowler = Arrays.stream(bowler);
       String[] team =  Stream.concat(sBatsman,sBowler).toArray(s-> new String[s]);
       for(String s : team)
       {
           System.out.println(s);
       }
    }
}
