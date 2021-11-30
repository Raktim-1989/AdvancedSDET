package com.qa.programming;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileContentCount {

    static String path = "/Users/raktimsarkar/code/AdvancedJava/Demo.txt";

    public static void main(String[] args) {

        int wordCount = 0;
        int charCount = 0;
        int lineCount = 0;
        BufferedReader bf;
        try {
             bf = new BufferedReader(new FileReader(path));
             String currentLine = bf.readLine();

             while(currentLine != null)
             {
                 lineCount++;

                 //words
                 String[] words = currentLine.split(" ");
                 wordCount = wordCount + words.length;

                 //lines
                 for(String w : words)
                 {
                     charCount = charCount + w.length();
                 }
                currentLine=  bf.readLine();

             }

            System.out.println("Total number of lines : " + lineCount);
            System.out.println("Total number of words : " + wordCount);
            System.out.println("Total number of characters:  " + charCount);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
