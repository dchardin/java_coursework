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
public class Student extends Person {
    
    protected String myIdNum;
    protected double myGPA;
    
    public Student(String name, int age, String gender, String idNum, double gpa) {
        
        super(name, age, gender);
        
        this.myIdNum = idNum;
        this.myGPA = gpa;
        
    }
    
    public String getIdNum() {
        
        return myIdNum;
        
    }
    
    public double getGPA() {
        
        return myGPA;
        
    }
    
    public void setIdNum(String myIdNum) {
        
        this.myIdNum = myIdNum;
        
    }
    
    public void setGPA(double myGPA) {
        
        this.myGPA = myGPA;
        
    }
    
    
    @Override
    public String toString() {
        
        return super.myName + ", age: " + super.myAge + ", gender: " + super.myGender + ", idnum: " + myIdNum + ", gpa: " + myGPA;
        
    }    
    
}
