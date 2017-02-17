/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc230_a1_q2;

/**
 *
 * @author donnie
 */

import java.util.Scanner;
import java.lang.Math;

public class Csc230_a1_q2 {

    private static Scanner inputCatcher = new Scanner(System.in);
    
    public static void main(String[] args) {
    
    double a = 1;
    double b = 2;
    double c = 3;
            
    System.out.println("Please enter a value for x: ");
    a = inputCatcher.nextDouble();
    System.out.println("Please enter a value for y: ");
    b = inputCatcher.nextDouble();
    System.out.println("Please enter a value for z: ");
    c = inputCatcher.nextDouble();
    
    double calcOut = getVals(a, b, c);
    
    System.out.println(calcOut);
    
    }
    
    
    public static double getVals(double x, double y, double z) {
        
        double result;
        
        double xySum = x + y;
        
        result = (Math.pow(x, 3) + Math.pow(y, 3) + Math.pow(z, 4) + Math.pow(xySum, 4) + z);
        
        return result;
        
    }    
    
    
}
