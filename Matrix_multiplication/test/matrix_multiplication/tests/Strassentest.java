/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix_multiplication.tests;

import matrix_multiplication.Strassen1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Umer Ahmad Mehtab
 */
public class Strassentest {
    
    public Strassentest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void multiply() {
         Strassen1 st=new Strassen1();
         
         int A [][]=  {{1,1},{1,1}};
         int B [][]=  {{1,1},{1,1}};
         int C [][]=  {{2,2},{2,2}};
         
         assertArrayEquals(C, st.multiply(A, B));
    
     }
}
