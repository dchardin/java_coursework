/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assn_7;

/**
 *
 * @author donnie
 */
public class Assn_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int c = 1; c <= 5; c++){
            for (int x = 1; x <= c; x++) {
                System.out.print("h");
            }
            System.out.println(" ");
        }
        
        
        for (int z = 6; z >= 1; z--) {
            for (int t = 0; t < z - 1; t++) {
                System.out.print("h");
            }
            System.out.println(" ");
            
        }
        
    }
    
}
