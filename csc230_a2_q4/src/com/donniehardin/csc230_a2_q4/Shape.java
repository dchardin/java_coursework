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
public abstract class Shape {
    
    public String color;
    
    public Shape(String color) {
        
        this.color = color;
        
    }
    
    public abstract double getArea();
    
    @Override
    public String toString() {
        
        return "Color: " + color;
        
    }
    
    
}
