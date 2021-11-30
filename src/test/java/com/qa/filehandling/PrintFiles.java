package com.qa.filehandling;

import java.io.File;
import java.util.Arrays;

public class PrintFiles {
    /*
        Print all files and folders in a directory in sorted order
     */

    public static void main(String[] args) {

        String path = "/Users/raktimsarkar/Downloads";
        File file = new File(path);
        File[] fileArray = file.listFiles();
        Arrays.sort(fileArray);
        for(File f : fileArray)
        {
            if(f.isFile())
            {
                System.out.println("File: " + f.getName() + " " + f.getAbsolutePath());

            }

            else if (f.isDirectory())
            {
                System.out.println("Directory: " + f.getName() + " " + f.getAbsolutePath());
            }
            else
            {
                System.out.println("Not a file or directory " + f.getName() + " " + f.getAbsolutePath());
            }
        }


    }
}
