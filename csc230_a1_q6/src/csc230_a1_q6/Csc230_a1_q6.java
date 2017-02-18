/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc230_a1_q6;

import java.util.Scanner;

public class Csc230_a1_q6 {

    private static Scanner inputCatcher = new Scanner(System.in);

    public static void main(String[] args) {
        
        double x = 1;
        double y = 3;
        
        posPairFinder(x,y);
        
    }
    
    public static void posPairFinder(double a, double b) {

             
        double answer;
        
        for (a = 0; a <= 1000; a++) {
            
            for (b = 0; b <= 1000; b++){
                
        answer = ((Math.pow(a, 2)) + (Math.pow(b, 2)) + 1) / (a*b);
        
        if (answer % 1 == 0)
        
        System.out.println("(" + a + ", " + b + ")") ;
        
            }
      
        }
    
        

    
    }
    

    
}
