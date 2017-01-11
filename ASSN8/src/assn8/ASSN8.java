/*
 Create a system for a halloween candy vending system. Your products should be:
Mini-Candy Bars, Bubble Gum Packs, Popcorn Balls, Gummy Monsters.

Hard code a price for each item. The system should ask the user which item they
would like. If the user is finished, a total cost should be displayed.
 */
package assn8;

/**
 *
 * @author donnie
 * 
 * 
 */


import java.util.Scanner;

public class ASSN8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int selection = 0;
        int oneCount = 0;
        int twoCount = 0;
        int threeCount = 0;
        int fourCount = 0;
        
        String oneTitle = "Mini-Candy Bars";
        String twoTitle = "Bubble Gum Packs";
        String threeTitle = "Popcorn Balls";
        String fourTitle = "Gummy Monsters";
        
        double onePrice = 3.96;
        double twoPrice = 2.45;
        double threePrice = 1.07;
        double fourPrice = 2.10;
        
        
        Scanner input = new Scanner(System.in);
        
        while (selection != 8)
        
        {   
            System.out.printf("Which item do you want?: %n");
            selection = input.nextInt();
            
            switch (selection)
            
            {
                case 1:
                System.out.printf("You have added: %s%n", oneTitle);
                oneCount++;
                    break;
                    
                case 2:
                System.out.printf("You have added: %s%n", twoTitle);
                twoCount++;
                    break;
                    
                case 3:
                System.out.printf("You have added: %s%n", threeTitle);
                threeCount++;
                    break;
                    
                case 4:
                System.out.printf("You have added: %s%n", fourTitle);
                fourCount++;
                    break;
                    
                case 5:
                System.out.printf("Empty key no product added to the order");
                    break;
                    
                case 6:
                System.out.printf("Empty key, no product added to the order");
                    break;
                    
                case 7:
                System.out.printf("Empty key, no product added to the order");
                    break;
                    
                case 8:
                
                double oneTotal = oneCount * onePrice;
                double twoTotal = twoCount * twoPrice;
                double threeTotal = threeCount * threePrice;
                double fourTotal = fourCount * fourPrice;
        
                double total = oneTotal + twoTotal + threeTotal + fourTotal;
                
                System.out.print("Your order is complete, you owe: ");
                System.out.print(total);
                    break;
                    
                    
            }
                
                
            }
        
        }
        


        
    }
    

