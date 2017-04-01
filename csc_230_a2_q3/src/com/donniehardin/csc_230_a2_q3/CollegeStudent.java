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
public class CollegeStudent extends Student {
    
    protected String myMajor;
    protected int myYear;
    
    /**
     *
     * @param name
     * @param age
     * @param gender
     * @param idNum
     * @param gpa
     * @param major
     * @param year
     */
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year) {
        
        super(name, age, gender, idNum, gpa);
        
        this.myMajor = major;
        this.myYear = year;
        
    }
    
    public String getMajor() {
        
        return myMajor;
        
    }
    
    public double getYear() {
        
        return myYear;
        
    }
    
    public void setMajor(String myMajor) {
        
        this.myMajor = myMajor;
        
    }
    
    public void setYear(int myYear) {
        
        this.myYear = myYear;
        
    }
    
    
    @Override
    public String toString() {
        
        return super.myName + ", age: " + super.myAge + ", gender: " + super.myGender + ", idnum: " + super.myIdNum + ", gpa: " + super.myGPA + ", major: " + myMajor + ", year: " + myYear ;
        
    }     
    
    
}
