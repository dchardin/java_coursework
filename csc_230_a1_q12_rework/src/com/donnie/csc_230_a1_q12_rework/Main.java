package com.donnie.csc_230_a1_q12_rework;

import java.util.Scanner;

/**
 *
 * @author donnie
 */
public class Main {

    public static void main(String[] args) {

        /** note, all of my search methods work with 
         * the test cases, but only my horizontal search method hSearch() will
         * work with the array that my arrayBuilder() method builds. 
         * 
         * Getting arrayIndexoutofbounds errors with the others...which makes no
         * sense since they work with the test case matricies.
         * 
         * I cannot
         * Find any issue with the array that arrayBuilder() builds. I am 
         * too close to the deadline and I have not been able to sort out
         * the bug.
         */
        
        
        
    Main.arrayBuilder();
        
/**        
        
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

        
        
        
        if (vSearch(a_verical)) {
            System.out.println("We have a pattren");
        } else {
            System.out.println("We don't have a pattern");
        }

        
        if (hSearch(a_horizontal)) {
            System.out.println("We have a pattren");
        } else {
            System.out.println("We don't have a pattern");
        }        
        
        
        if (topDownDiag(a_diagonal)) {
            System.out.println("We have a pattren");
        } else {
            System.out.println("We don't have a pattern");
        }

        if (bottomUpDiag(a_adiagonal)) {
            System.out.println("We have a pattren");
        } else {
            System.out.println("We don't have a pattern");
        }
        
**/



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
        
        Main.arrayPrinter(matrix);
        Main.hSearch(matrix);
//        Main.vSearch(matrix);
//        Main.topDownDiag(matrix);
//        Main.bottomUpDiag(matrix);

    
        
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

                    System.out.println("There are four horizontally consecutive values.");

                    h = true;

                }

            }

        }

        return h;
    }

    public static boolean vSearch(int[][] x) {

        boolean v = false;

        for (int i = 0; i < x[0].length; i++) {

            for (int j = 0; j < x.length - 3; j++) {

                if (x[i][j] == x[i + 1][j] && x[i][j] == x[i + 2][j] && x[i][j] == x[i + 3][j]) {

                    System.out.println("There are four vertically consecutive values.");

                    v = true;
                }
            }

        }

        return v;

    }

    public static boolean topDownDiag(int[][] x) {

        boolean tdd = false;

        for (int i = 0; i < x.length - 3; i++) {

            for (int j = 0; j < x[0].length - 3; j++) {

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

                    System.out.println("There are four upwardly diagonal consecutive values.");

                    bud = true;

                }
            }

        }

        return bud;

    }

}