/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donniehardin.csc230_a1_q7_rework;

/**
 *
 * @author donnie
 */

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {


        Scanner inputCatcher = new Scanner(System.in);

        System.out.println("Please enter the number of rows for A: ");
        int rowsA = inputCatcher.nextInt();
        System.out.print("Please enter the number of columns for A (rows in B): ");
        int colsA = inputCatcher.nextInt();
        System.out.println("Please enter the number of columns for B");
        int colsB = inputCatcher.nextInt();

        int [][] a = new int[rowsA][colsA];
        int [][] b = new int[colsA][colsB];


        System.out.println("Please enter Matrix A");

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[0].length; j++) {

                a[i][j] = inputCatcher.nextInt();

            }

        }

        System.out.println("Please enter Matrix B");

        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < b[0].length; j++) {

                b[i][j] = inputCatcher.nextInt();

            }

        }
        int [][] c = findProducts(a, b);
        System.out.println("The product of A and B is: ");

        for (int i = 0; i < c.length; i++) {

            for (int j = 0; j < c[0].length; j++) {

                System.out.println(c[i][j] + " ");

            }

            System.out.println();
        }


    }

    public static int[][] findProducts(int[][] a, int[][] b) {

        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        int[][] c = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {

            for (int j = 0; j < colsB; j++) {

                for (int k = 0; k < colsA; k++) {

                    c[i][j] = c[i][j] + a[i][k] * b [k][j];

                }

            }

        }

        return c;

    }    
    
}
