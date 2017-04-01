/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donniehardin.csc_230_a2_question_2;

/**
 *
 * @author donnie
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        /**
        
        Author sipser = new Author ("Michael Sipser", "msipser@mit.edu", 'm');
        Book toc = new Book ("Theory of Computation", sipser, 200.00, 12);
               
        System.out.println(sipser.toString());
        
        **/
        
        Book toc = new Book ("Theory of Computation", new Author ("Michael Sipser", "msipser@mit.edu", 'm'), 200.00, 12);
        
        System.out.println(toc.getName());
        System.out.println(toc.getPrice());
        System.out.println(toc.getQtyInStock());
        
        System.out.println(toc.getAuthor());
        
        System.out.println(toc.toString());
       
    }
    
    
}
