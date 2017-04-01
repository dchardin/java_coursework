/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donniehardin.csc230_a2_q4;

/**
 *
 * @author donnie
 */
public class Triangle extends Shape {
    
    public int base;
    public int height;
    
    public Triangle(String color, int base, int height) {
        
        super(color);
        this.base=base;
        this.height=height;
        
    }
    
    @Override 
    public double getArea() {
        
       double area = 0.5 * base * height;
        
       return area;
    }
    
    @Override
    public String toString() {
        
        return ", Color: " + super.color + ", area: " + getArea();
        
    }        
    
}
