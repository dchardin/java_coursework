/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc230_a1_q3;

import java.util.Scanner;

public class Csc230_a1_q3 {

private static Scanner inputCatcher = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int splitDigit = 0;
        

        System.out.println("Please enter a 5 digit integer: ");
        splitDigit = inputCatcher.nextInt();
        
        
        while( splitDigit > 0 ) {
                
                int modDigit = splitDigit%10;
//                splitDigit = splitDigit/10;
                System.out.println(splitDigit);
        }
        
        
    }
    
}
