/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.donnie_csc_230_a1_q3_rework;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author donnie
 */
public class Csc_230_a1_q3_reworkTest {
    
    public Csc_230_a1_q3_reworkTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of tabSplitter method, of class Csc_230_a1_q3_rework.
     */
    
    /**
     * 
     * Not sure how to make my result equal whatever my real method spits out..
     * So just filling it in for now.
     */
    
    @Test
    public void testTabSplitter001() {
        System.out.println("tabSplitter");
        Csc_230_a1_q3_rework instance = new Csc_230_a1_q3_rework();
        int splitDigit = 23432;
        String expResult = "2   3   4   3   2";
        String result = "2  3   4   3   2";
        assertEquals(expResult, result);
    }
    
        /**
     * Test of tabSplitter method, of class Csc_230_a1_q3_rework.
     */
    @Test
    public void testTabSplitter002() {
        System.out.println("tabSplitter");
        Csc_230_a1_q3_rework instance = new Csc_230_a1_q3_rework();
        int splitDigit = 23432;
        String expResult = "2   3   4   3   2";
        
    }
    
    

    /**
     * Test of main method, of class Csc_230_a1_q3_rework.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Csc_230_a1_q3_rework instance = new Csc_230_a1_q3_rework();
        
    }
    
}
