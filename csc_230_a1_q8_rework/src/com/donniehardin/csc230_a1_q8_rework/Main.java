/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donniehardin.csc230_a1_q8_rework;

/**
 *
 * @author donnie
 */
public class Main {
    
    public static void main(String[] args) {
    
        commonFinder();
        
    }
    
    public static void commonFinder(){

        int[] firstArray = {23,43,45,65};
        int[] secondArray = {24,75,45,63,23};


        if (firstArray.length <= secondArray.length) {

            for (int i = 0; i < firstArray.length; i++) {
                for (int j = 0; j < secondArray.length; j++){
                    if(firstArray[i] == secondArray[j] ) {
                        System.out.println(firstArray[i]);
                    }
                }
            }

        } else {

            for (int i = 0; i < secondArray.length; i++) {
                for (int j = 0; j < firstArray.length; j++){
                    if(secondArray[i] == firstArray[j] ) {
                        System.out.println(firstArray[j]);
                    }
                }
            }

        }

    }

    
}
