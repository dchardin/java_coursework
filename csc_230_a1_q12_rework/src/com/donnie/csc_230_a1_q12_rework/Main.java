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
        
 
        
    }
    
    public static void arrayBuilder() {
        
        Scanner inputCatcher = new Scanner(System.in); 
        
        System.out.println("Please enter an integer greater than 4 for rows");
        
        int rows = inputCatcher.nextInt();
        
        System.out.println("please enter an integer greater than 4 columns");
        
        int cols = inputCatcher.nextInt();
        
        int [][] matrix = new int[rows][cols];
        
        int valRange = (((rows * cols) / 4)-1);
        
        for (int i = 0; i < matrix.length; i++) {
            
            for (int j=0; j < matrix[i].length; j++) {
                
                matrix[i][j] = (int)(Math.random() * valRange);
            }
            
        }
            
        
    }
    
    
    
}