/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc230_a1_q5;

/**
 *
 * @author donnie
 */

import java.util.Scanner;

public class Csc230_a1_q5 {

private static Scanner inputCatcher = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        double hexArea;
        double a;
        
    System.out.println("Please enter a value for x: ");
    a = inputCatcher.nextDouble();        
    
    hexArea = hexAreacalc(a);
    
    System.out.println(hexArea);
    
    }
    
    public static double hexAreacalc(double x) {
        
        double piDiv6 = Math.PI / 6;
        
        double calcResult = (6 * (Math.pow(x, 2))) / (4 * Math.tan(piDiv6));
        
        return calcResult;
        
    }
    
}
