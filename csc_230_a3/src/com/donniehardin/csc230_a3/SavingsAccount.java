/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donniehardin.csc230_a3;

/**
 *
 * @author donnie
 */
public class SavingsAccount extends Account {
    
    public SavingsAccount(int accountNumber, int balance, String memberName, String memberAddress) {
        
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.memberName = memberName;
        this.memberAddress = memberAddress;
        
    }
    
    public void withdraw(int withdrawAmount){
        
        if (withdrawAmount < 20) {
            
            System.out.println("Error, withdrawAmount must be greater than 20");
            
            
            
        }
        
        else if (withdrawAmount > balance) {
            
            System.out.println("amount exceeds balance");
            
        }
        
        else {
            
            balance = balance - withdrawAmount;
            
        }
        
    }
    
    
    public void deposit (int depositAmount) {
        
        if (depositAmount > 0)
            
            balance = balance + depositAmount;
        
    }
    
}
