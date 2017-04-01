/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donniehardin.csc_230_a2_q3;

/**
 *
 * @author donnie
 */
public class Person {
    
    protected String myName;
    protected int myAge;
    protected String myGender;
    
    public Person(String name, int age, String gender) {
        
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
        
    }
    
    public String getName() {
        
        return myName;
        
    }
    
    public int getAge() {
        
        return myAge;
        
    }
    
    public String getGender() {
        
        return myGender;
        
    }
    
    public void setName(String myName) {
        
        this.myName = myName;
        
    }
    
    public void setAge(int myAge) {
        
        this.myAge = myAge;
        
    }
    
    public void setGender(String myGender) {
        
        this.myGender = myGender;
        
    }
    
    
    
    @Override
    public String toString() {
        
        return myName + ", age: " + myAge + ", gender: " + myGender;
        
    }
    
}


