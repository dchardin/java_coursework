package com.donniehardin.a1_q4;

import java.util.Scanner;

public class Csc_230_a1_q4_rework_main {
    
    public static Scanner input = new Scanner(System.in);
    

    public static int realChecker(int a, int b, int c) {
        
        int result = 5;
        
        double checked = ((Math.pow(b, 2) - 4 * a * c)) ;
        
        if (checked < 0) {
        
            result = -1;
            
        } else if (checked == 0){
            
            result = 0;
            
        } else if (checked > 0){
            
            result = 1;
        }
        
        return result;
        
    }
    
    public static double posSolver(int a, int b, int c) {
     
        double posSolved = (-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / 2 * a ;
        
        return posSolved;
        
    }
    
    public static double negSolver(int a, int b, int c) {
        
        double negSolved = (-b - Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / 2 * a ;
        
        return negSolved;
        
    }

    
    public static void main(String[] args) {
        
        System.out.println("Please enter a value for a");
        
        int x = input.nextInt();
        
        System.out.println("Please enter a value for b");
        
        int y = input.nextInt();
        
        System.out.println("Please enter a value for c");
        
        int z = input.nextInt();
           
        realChecker(x,y,z);

        if (realChecker(x,y,z) == -1 ) {
            
            System.out.println("There are no real roots for " + x +"," + y + "," + z);
            
        } else if (realChecker(x,y,z) == 0 ) {
            
            System.out.println("There is one root and it is: " + posSolver(x,y,z));
            
        } else if (realChecker(x,y,z) == 1) {
            
            System.out.println("There are two roots and they are: Pos: " + posSolver(x,y,z) + " Neg: " + negSolver(x,y,z));
            
        }
        
        
        
    }
    
    
}
