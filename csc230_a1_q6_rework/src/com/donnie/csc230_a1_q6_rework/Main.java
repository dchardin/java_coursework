
package com.donnie.csc230_a1_q6_rework;

public class Main {
    
    public static void main(String[] args) {
        
        posPairFinder(2341);
        
    }
    
    
    public static void posPairFinder(int n) {
        
        for (int b = 1; b < n; b++) {
            
            for (int a = 1; a < b; a++) {
                
                if ((a * a + b * b + 1) % (a * b) == 0) {
                    
                    System.out.println("(" + a + "," + b + ")");
                    
                }
                
            }
            
        }
        
        
    }
    
    
}
