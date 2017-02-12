/* 
 * This program will take an arbitrary string as a parameter. It will then 
 * print that string out on the console screen.
*/
package csc230_a1q1;

import java.util.Scanner;

/**
 *
 * @author donnie
 */
public class Csc230_A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        String name = "null";
        
        System.out.println("Please enter your name: ");
        
        name = input.next();
        
        System.out.print(name);
        
        
    }
    
}
