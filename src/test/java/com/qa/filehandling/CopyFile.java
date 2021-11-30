package com.qa.filehandling;

import java.io.*;

public class CopyFile {

    /*
    *File Handling -1
    * Copy a file (pdf) and create a diff file in the same location
     */

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/raktimsarkar/Downloads/OracleSalaryLetter.pdf");
        File fileCpy = new File("/Users/raktimsarkar/Downloads/OracleSalaryLettercopy.pdf");

        FileInputStream fis ;
        FileOutputStream fos;
        fis = new FileInputStream(file);
        fos = new FileOutputStream(fileCpy);

        //bytes available in the pdf
        try {
            System.out.println(fis.available());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //read each line of the file
        int i = 0;
        while((i = fis.read()) != -1)
        {
            fos.write(i);
        }
          if(fis != null)
          {
                fos.close();
          }


    }
}
