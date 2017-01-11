/*
Chapter 4 material (demonstrating a simple loop and a nested if statement.)


You are writing a billing program that adds up the items a user enters. 
Your program should use a loop and prompt the user for the item number for 
each item in inventory to add to the bill. 
(You can ask the user for the number of items you will enter and use a counter 
controlled loop or a sentinel controlled loop that has a stop number. 
Either way is fine.) Here is the table of items in inventory:


Item Value

1 209.00
2 129.50
3 118.00
4 232.00


(So if your program starts asking the user for the items they are purchasing 
and they enter item 2 with quantity 2, and item 3 with quantity 1. 
The bill should be 377.00. On the next run if your program asks the user for 
items in the loop and they give enter each item with quantity of 1. The bill 
should be 688.50)



 */
package assn_5;

import java.util.Scanner;

/**
 *
 * @author donnie
 */
public class ASSN_5 {

    
    
    public static void main(String[] args) {
        
        int moreitems = 0;
        double bill = 0;
        double tempvalue = 0;
        
        Scanner input = new Scanner(System.in);
       
        
        while (moreitems == 0)    
        {System.out.print("Which item do you want?: ");
        int tempitem = input.nextInt();
        if (tempitem == 1)
            tempvalue = 209.00;
        else if (tempitem == 2)
            tempvalue = 129.50;
        else if (tempitem == 3)
            tempvalue = 118.00;
        else if (tempitem == 4)
            tempvalue = 232.00;
        else
        {System.out.print("Invalid entry, please restart the program");}
        
        {System.out.print("How many do you want? ");
        int itemamt = input.nextInt();
        tempvalue = tempvalue * itemamt;
        
        bill = bill + tempvalue;
        
        {System.out.print("Would you like another item? Enter 0 for yes or 1 for no: ");
        moreitems = input.nextInt();
        
        tempvalue = 0;
        itemamt = 0;
        }
        
    System.out.printf("Bill amount: %s%n", bill);
        
    }
    
}
