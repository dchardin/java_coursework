/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donnie.csc_230_a1_q12_rework;

import java.util.Scanner;

/**
 *
 * @author donnie
 */
public class Main {

    public static void main(String[] args) {

        int a_horizontal[][] = {
            {11, 71, 41, 11, 11},
            {21, 81, 51, 21, 21},
            {31, 91, 61, 31, 31},
            {41, 11, 11, 11, 11},
            {51, 21, 81, 51, 51},
            {61, 31, 91, 61, 61}};

        int a_verical[][] = {
            {11, 71, 41, 11, 11},
            {21, 81, 51, 21, 21},
            {31, 81, 61, 31, 31},
            {41, 81, 71, 41, 41},
            {51, 81, 81, 51, 51},
            {61, 31, 91, 61, 61}};

        int a_diagonal[][] = {
            {11, 71, 41, 11, 11},
            {21, 81, 51, 21, 21},
            {31, 91, 61, 31, 31},
            {41, 11, 91, 11, 11},
            {51, 21, 81, 91, 51},
            {61, 31, 91, 61, 91}};

        int a_adiagonal[][] = {
            {11, 71, 41, 11, 11},
            {21, 81, 51, 21, 21},
            {31, 91, 21, 31, 31},
            {41, 21, 71, 41, 41},
            {21, 21, 81, 51, 51},
            {61, 31, 91, 61, 61}};

        if (hSearch(a_horizontal) || vSearch(a_verical) || topDownDiag(a_diagonal) || bottomUpDiag(a_adiagonal)) {
            System.out.println("We have a pattren");
        } else {
            System.out.println("We don't have a pattern");

        }
    }
    

    public static void arrayBuilder() {

        Scanner inputCatcher = new Scanner(System.in);

        System.out.println("Please enter an integer greater than 4 for rows");

        int rows = inputCatcher.nextInt();

        System.out.println("please enter an integer greater than 4 columns");

        int cols = inputCatcher.nextInt();

        int[][] matrix = new int[rows][cols];

        int valRange = (((rows * cols) / 4) - 1);

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = (int) (Math.random() * valRange);
            }

        }

        System.out.println("array created.");

        arrayPrinter(matrix);

    }

    public static void arrayPrinter(int[][] some2Darray) {

        for (int i = 0; i < some2Darray.length; i++) {

            for (int j = 0; j < some2Darray[i].length; j++) {

                System.out.print(some2Darray[i][j] + " ");

            }

            System.out.println();
        }

    }

    public static boolean hSearch(int[][] x) {

        boolean h = false;

        for (int i = 0; i < x.length; i++) {

            for (int j = 0; j < x[0].length - 3; j++) {

                if (x[i][j] == x[i][j + 1] && x[i][j] == x[i][j + 2] && x[i][j] == x[i][j + 3]) {

                    System.out.println("There are four horizontally consecutive values starting at:" + x[i][j]);

                    h = true;

                }

            }

        }

        return h;
    }

    public static boolean vSearch(int[][] x) {

        boolean v = false;

        for (int i = 0; i < x[0].length - 3; i++) {

            for (int j = 0; j < x.length; j++) {

                if (x[i][j] == x[i + 1][j] && x[i][j] == x[i + 2][j] && x[i][j] == x[i + 3][j]) {

                    System.out.println("There are four vertically consecutive values starting at:" + x[i][j]);

                    v = true;
                }
            }

        }

        return v;

    }

    public static boolean topDownDiag(int[][] x) {

        boolean tdd = false;

        for (int i = 0; i < x.length - 3; i++) {

            for (int j = 0; j < x[0].length; j++) {

                if (x[i][j] == x[i + 1][j + 1] && x[i][j] == x[i + 2][j + 2] && x[i][j] == x[i + 3][j + 3]) {

                    System.out.println("There are four downwardly diagonal consecutive values starting at:" + x[i][j]);

                    tdd = true;

                }
            }

        }

        return tdd;

    }

    public static boolean bottomUpDiag(int[][] x) {

        boolean bud = false;

        for (int i = 3; i < x.length; i++) {

            for (int j = 0; j < x.length - 3; j++) {

                if (x[i][j] == x[i - 1][j + 1] && x[i][j] == x[i - 2][j + 2] && x[i][j] == x[i - 3][j + 3]) {

                    System.out.println("There are four downwardly diagonal consecutive values starting at:" + x[i][j]);

                    bud = true;

                }
            }

        }

        return bud;

    }

}
