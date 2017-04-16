package com.donniehardin.csc230_a3;


public abstract class Account {
    
    public int accountNumber;
    public int balance;
    public String memberName;
    public String memberAddress;
    
    /**
    public Account(int accountNumber, int balance, String memberName, String memberAddress) {
        
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.memberName = memberName;
        this.memberAddress = memberAddress;
        
    }
    **/
    
    public int getAccountNumber() {
        
        return accountNumber;
        
    }
    
    public int getBalance() {
        
        return balance;
        
    }
    
    public String getMemberName() {
        
        return memberName;
        
    }
    
    public String getMemberAddress() {
        
        return memberAddress;
        
    }
    
    public void setAccountNumber(int accountNumber) {
        
        this.accountNumber = accountNumber;
        
    }
    
    public void setBalance(int balance) {
        
        this.balance = balance;
        
    }
    
    public void setMemberName(String memberName) {
        
        this.memberName = memberName;
        
    }
    
    public void setMemberAddress(String memberAddress) {
        
        this.memberAddress = memberAddress;
        
    }
    
    
    
}
