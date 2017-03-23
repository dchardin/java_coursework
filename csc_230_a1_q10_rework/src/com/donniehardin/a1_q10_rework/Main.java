/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donniehardin.a1_q10_rework;

/**
 *
 * @author donnie
 */
public class Main {

    public static void main(String[] args) {
    
    diceThrow();
    
    }    
    
    
    public static void diceThrow() {
    
    int tallys[] = new int [11];
    

    
    
    int dice1;
    int dice2;
    int sum;
    
    for (int i = 0; i < 36000; i++) {
        
        dice1 = (int)(Math.random()*6) + 1;
        dice2 = (int)(Math.random()*6) + 1;
        
        sum = dice1 + dice2;
        
        tallys[sum - 2] += 1;
        
    }
         
    for (int j = 0; j < tallys.length; j++) {
        
        System.out.println(tallys[j]);
        
    }
    
    
    }
    
}
