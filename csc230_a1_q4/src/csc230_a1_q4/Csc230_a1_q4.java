/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc230_a1_q4;

import java.util.Scanner;

public class Csc230_a1_q4 {

    private static Scanner inputCatcher = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        double x = 1;
        double y = 2;
        double z = 3;
        double discResult;
        double qposResult;
        double qnegResult;
       
        
        System.out.println("Please enter a value for a: ");
        x = inputCatcher.nextDouble();
        System.out.println("Please enter a value for b: ");
        y = inputCatcher.nextDouble();
        System.out.println("Please enter a value for c: ");
        z = inputCatcher.nextDouble();
        
        discResult = rootChecker(x,y,z);
        
        if (discResult < 0) {
            
            System.out.println("There are no real roots");
            
        } else if (discResult == 0) {
            
            qposResult = r1RootFinder(x,y,d);
            
            System.out.println("There is one root: ");
            System.out.println(qposResult);
            
        } else if (discResult > 0) {
            
            qnegResult = r2RootFinder(x,y,d);
            
            System.out.println("There are two roots: ");
            System.out.println(qposResult);
            System.out.println(qnegResult);
            
            
        }
        
        
    }
    

    
    public static double rootChecker(double a, double b, double c) {
        
        double calcDisc;
        
        calcDisc = ((Math.pow(b, 2) - 4 * a * c)) ;
        
        return calcDisc;

    }
    
    public static double r1RootFinder(double a, double b, double d) {
        
        double calcr1;
        
        calcr1 = (-b + Math.sqrt(d)) / 2 * a ;
        
        return calcr1;
        
    }
    
    public static double r2RootFinder(double a, double b, double d) {
        
        double calcr2;
        
        calcr2 = (-b - Math.sqrt(d)) / 2 * a ;
        
        return calcr2;
        
    }
    
}
