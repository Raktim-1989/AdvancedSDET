package com.qa.programming;

import java.util.Scanner;

public class MatrixArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter total columns: ");
        int cols = sc.nextInt();

        //2D array
        int[][] data = new int[rows][cols];
        System.out.println("Please enter the matrix data ...");
        for(int i = 0; i <rows;i++)
        {
            for(int j = 0; j <cols;j++)
            {
                data[i][j] = sc.nextInt();
            }
        }

        //print the matrix:
        for(int i = 0; i <rows;i++)
        {
            for(int j = 0; j <cols;j++)
            {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }



    }
}
