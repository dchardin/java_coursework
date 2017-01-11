/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_6;

/**
 *
 * @author donnie
 */


import java.util.Scanner;

public class ASSIGNMENT_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int count = 0;
        String leTTer;
        int wxh;
        
        Scanner input = new Scanner(System.in);
        
        {
            System.out.println("Which character do you want to use?: ");
            leTTer = input.next();
        }
        
        {
            System.out.print("Please enter in a number between 1 and 10: ");
            wxh = input.nextInt();
        }
        
        {
            System.out.println();
        }
        
        while (count < wxh)
        {
            if (count == 0 || count == wxh -1)
            {
                for (int w = 0; w < wxh; w++)
                {
                    System.out.print(leTTer);
                }
            }
            else 
            {
                for (int w = 0; w < wxh; w++)
                {
                    if (w == 0 || w == wxh - 1)
                    {
                        System.out.print(leTTer);
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                
            }
        
            System.out.println();
            count = count + 1;
            
        }
        
                
    }
    
}
