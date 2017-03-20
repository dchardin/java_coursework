/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donniehardin.csc230_a1_q5_rework;

import java.util.Scanner;

public class Csc230_a1_q5_rework_main {
    
public static Scanner input = new Scanner(System.in);


public static void main(String[] args) {
    
    System.out.println(hexAreaCalc(getHexSide()));
    
}


public static double hexAreaCalc(double a) {
    
    double piDiv6 = Math.PI / 6;
    
    double area = (6 * (Math.pow(a, 2))) / (4 * Math.tan(piDiv6));
    
    return area;
    
}

public static double getHexSide() {
    
    System.out.println("Please enter a positive number");
    
    double a = input.nextDouble();
    
    if ( a <= 0 ) {
    
    System.out.println("You have entered in a value lesser than or equal to zero");
    System.out.println("Using 1");
    
    a = 1; } 
    
    return a;
    
}

}


