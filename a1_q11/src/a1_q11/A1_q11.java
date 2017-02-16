/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1_q11;

/**
 *
 * @author donnie
 */

import java.util.Scanner;

public class A1_q11 {

    private static Scanner inputCatcher = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        int m11 = 0;
        int m12 = 0;
        int m13 = 0;
        int m21 = 0;
        int m22 = 0;
        int m23 = 0;
        int m31 = 0;
        int m32 = 0;
        int m33 = 0;
        int t1 = 0;
        int t2 = 0;
        int t3 = 0;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
                
        int affineline1 = 0;
        int affineline2 = 0;
        int affineline3 = 0;
        
        
        int affineArray [][] = {{1, 1, 1, 1, 1}, {2, 2, 2, 2, 2}, {3, 3, 3, 3, 3}};
        
        System.out.println("Please enter an integer for m1,1");
        m11 = inputCatcher.nextInt();
        affineArray[0][0] = m11;
        
        System.out.println("Please enter an integer for m1,2");
        m12 = inputCatcher.nextInt();
        affineArray[0][1] = m12;
        
        System.out.println("Please enter an integer for m1,3");
        m13 = inputCatcher.nextInt();
        affineArray[0][2] = m13;

        System.out.println("Please enter an integer for t1");
        t1 = inputCatcher.nextInt();
        affineArray[0][3] = t1;

        System.out.println("Please enter an integer for p1");
        p1 = inputCatcher.nextInt();
        affineArray[0][4] = p1;



        System.out.println("Please enter an integer for m2,1");
        m21 = inputCatcher.nextInt();
        affineArray[1][0] = m21;
        
        System.out.println("Please enter an integer for m2,2");
        m22 = inputCatcher.nextInt();
        affineArray[1][1] = m22;
        
        System.out.println("Please enter an integer for m2,3");
        m23 = inputCatcher.nextInt();
        affineArray[1][2] = m23;

        System.out.println("Please enter an integer for t2");
        t2 = inputCatcher.nextInt();
        affineArray[1][3] = t2;

        System.out.println("Please enter an integer for p2");
        p2 = inputCatcher.nextInt();
        affineArray[1][4] = p2;

        
        System.out.println("Please enter an integer for m3,1");
        m31 = inputCatcher.nextInt();
        affineArray[2][0] = m31;
        
        System.out.println("Please enter an integer for m3,2");
        m32 = inputCatcher.nextInt();
        affineArray[2][1] = m32;
        
        System.out.println("Please enter an integer for m3,3");
        m33 = inputCatcher.nextInt();
        affineArray[2][2] = m33;

        System.out.println("Please enter an integer for t3");
        t3 = inputCatcher.nextInt();
        affineArray[2][3] = t3;

        System.out.println("Please enter an integer for p3");
        p3 = inputCatcher.nextInt();
        affineArray[2][4] = p3;        
        
        
        display(affineArray);

        affineline1 = (affineArray[0][0] * affineArray[0][4]) + (affineArray[0][1] * affineArray[1][4]) + (affineArray[0][2] * affineArray[2][4]) + affineArray[0][3];
        affineline2 = (affineArray[1][0] * affineArray[0][4]) + (affineArray[1][1] * affineArray[1][4]) + (affineArray[1][2] * affineArray[2][4]) + affineArray[1][3];
        affineline3 = (affineArray[2][0] * affineArray[0][4]) + (affineArray[2][1] * affineArray[1][4]) + (affineArray[2][2] * affineArray[2][4]) + affineArray[2][3];
       
        
        System.out.println("total 1 is: "+affineline1);
        System.out.println("total 2 is: "+affineline2);
        System.out.println("total 3 is: "+affineline3);
        
    }
    
    public static void display(int x[] []){

        for (int row=0; row < x.length; row++ ) {
            for (int column=0; column < x[row].length;column++) {
                System.out.print(x[row] [column]+"\t");
            }
            System.out.println();

        }
    
    }   
    
}
