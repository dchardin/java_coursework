/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donniehardin.csc230_a3;

import java.util.Scanner;

/**
 *
 * @author donnie
 */
public class Main {
    
    public static CheckingAccount checkingAccountArray[] = new CheckingAccount[20];
    
    public static SavingsAccount savingsAccountArray[] = new SavingsAccount[20];

    
    
    public static void main (String[] args) {
        
        mainMenu();
        
        
        
    }
    
    
    public static void mainMenu() {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to the Bank!");
        System.out.println("");
        System.out.println("Please enter account number");
        
        int selection = input.nextInt();
        
        //potential for problem here..taking four digit int
        
        if (selection == 0000 ) {
            
            
            adminMenu();
            
        }
        
        else {
            
            normalMenu(selection);
            
        }
        
        
    }
    
    
    public static void adminMenu() {
        
        System.out.println("Welcome Administrator");
        System.out.println("Please select and option:");
        System.out.println();
        System.out.println("To add an account, press 1");
        System.out.println();
        System.out.println("");
        
    }
    
    //stopped here
    
    public static void normalMenu(int acctnum){
        
        
    }
    
    
}
