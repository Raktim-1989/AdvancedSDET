package com.qa.programming;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamArray {

    public static void main(String[] args) {
        String[] bats = {"rahul", "rohit", "virat", "pandya"};
        String[] bowls = {"bhuvi","shami","bumrah","chahal"};

        Stream<String> sBat = Arrays.stream(bats);
        Stream<String> sBowl = Arrays.stream(bowls);

        String[] total = Stream.concat(sBat,sBowl).toArray(size -> new String[size]);
        System.out.println(Arrays.toString(total));


    }
}
