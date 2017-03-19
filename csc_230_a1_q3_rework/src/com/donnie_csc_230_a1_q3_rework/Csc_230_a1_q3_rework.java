
/*

Write a program that inputs a 5-digit integer, separates the integer into its
digits, and prints them separated by tabs each.

For example, if the user types in 42339, the program should print:
4   2   3   3   9

Note: Do not convert your integer to a String and use String class methods to 
print it. You should use only integer division (/) and modulo operator (%) only.
You need to have a method that takes any arbitrary positive integer as an 
argument.

*/

package com.donnie_csc_230_a1_q3_rework;

import java.util.Scanner;

public class Csc_230_a1_q3_rework {

    private static Scanner inputCatcher = new Scanner(System.in);
    
    public static void tabSplitter() {
        

        int splitDigit, splitDigit1, splitDigit2, splitDigit3, splitDigit4, splitDigit5;
        
        System.out.println("Please enter a 5 digit integer: ");
        
        splitDigit = inputCatcher.nextInt();
        
        
        splitDigit1 = splitDigit / 10000;
        splitDigit2 = (splitDigit % 10000) / 1000;
        splitDigit3 = ((splitDigit % 10000) % 1000) / 100;
        splitDigit4 = (((splitDigit % 10000) % 1000) % 100) / 10;
        splitDigit5 = (((splitDigit % 10000) % 1000) % 100) % 10;
        
        System.out.printf("%d%s%d%s%d%s%d%s%d%n", splitDigit1, "   ", splitDigit2, "   ", splitDigit3, "   ", splitDigit4, "   ", splitDigit5);
        
        
    }
    
    
    public static void main (String [] args) {
        
        tabSplitter();
        
        
    }
    
    
}