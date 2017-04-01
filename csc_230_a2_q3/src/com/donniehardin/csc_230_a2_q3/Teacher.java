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
public class Teacher extends Person {
    
    protected String mySubject;
    protected double mySalary;
    
    
    public Teacher(String name, int age, String gender, String subject, double salary) {
        
        super(name, age, gender);
        
        this.mySubject = subject;
        this.mySalary = salary;
        
    }
    
    public String getSubject() {
        return mySubject;
    }
    
    public double getSalary(){
        return mySalary;
    }
    
    
    public void setSubject(String mySubject) {
        this.mySubject = mySubject;
    }
    
    public void setSalary(double mySalary) {
        this.mySalary = mySalary;
    }

    @Override
    public String toString() {
        
        return super.myName + ", age: " + super.myAge + ", gender: " + super.myGender + ", subject: " + mySubject + ", salary: " + mySalary;
        
    }
    
    
    
    
    
}
