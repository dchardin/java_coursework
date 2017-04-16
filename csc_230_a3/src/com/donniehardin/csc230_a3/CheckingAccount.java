package com.donniehardin.csc230_a3;

public class CheckingAccount extends Account {

public CheckingAccount(int accountNumber, int balance, String memberName, String memberAddress) {
    
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.memberName = memberName;
        this.memberAddress = memberAddress;
    
}

public void withdraw(int withdrawAmount) {
    
    if (withdrawAmount <= (balance - 0.5)) {
        
        balance = (balance - withdrawAmount);
        
    }
    
    else if (withdrawAmount >= (balance - 0.5)) {
        
        System.out.println("InvalidAmount");
        
        
        
    }
    
}


public void deposit(int depositAmount){
    
    if (depositAmount > 0) {
        
        balance = balance -depositAmount;
        
    }
    
    else if (depositAmount < 0) {
        
        System.out.println("Please enter in a valid positive amount");
        
    }
    
}


    
}
