/*

Think about working with the quadratic formula. 

If the discriminant is less than
zero, then the equation does not have any real roots.

If the discriminant is equal to zero, then there is one root.
If the discriminant is greater than zero, then there are two roots.

Write a java program to read a, b, and c from the keyboard and find the roots,
if they exist.

NOTE: You need to have a method that takes three real values as arguments

 */


/*

After studying the problem I first decomposed it into segments 

( part 1: first determine the result of the discriminate. 
  part 2: perform some action based on that result)

I then broke these down further, and formed several simple methods to be called
as the situation dictates. I did not want to bring in the complicated formulas
right away, so I decided to use simpler calculations in each method.
The structure thus far should be very similar to the finished product, but I 
want to pause for now and use this current structure to base my unit tests. 
I will commit this code as-is for now, and create my test files when I return
to work.

*/

package com.donniehardin.a1_q4;

import java.util.Scanner;

public class Csc_230_a1_q4_rework_main {
    
    public static Scanner input = new Scanner(System.in);
    

    public static int realChecker(int a, int b, int c) {
        
        int result = 5;
        
        int checked = a + b + c;
        
        if (checked < 0) {
        
            result = -1;
            
        } else if (checked == 0){
            
            result = 0;
            
        } else if (checked > 0){
            
            result = 1;
        }
        
        return result;
        
    }
    
    public static int posSolver(int a, int b, int c) {
     
        int posSolved = a + b + c;
        
        return posSolved;
        
    }
    
    public static int negSolver(int a, int b, int c) {
        
        int negSolved = a - b - c;
        
        return negSolved;
        
    }

    
    public static void main(String[] args) {
        
        System.out.println("Please enter a value for a");
        
        int x = 1;
        
        //int x = input.nextInt();
        
        System.out.println("Please enter a value for b");
        
        int y = 2;
        
        //int y = input.nextInt();
        
        System.out.println("Please enter a value for c");
        
        int z = 3;
        
        //int z = input.nextInt();
           
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
