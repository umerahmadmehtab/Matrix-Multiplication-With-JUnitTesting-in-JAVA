/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix_multiplication.tests;

import java.util.Random;
import java.util.Scanner;
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
public class Simple {
    
    public Simple() {
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
    
    
    
     public int[][] product(int [][]first,int[][]second,int m, int n, int p, int q)
   {
      int sum = 0, c, d, k;
 
      
      //System.out.println("Enter the elements of first matrix");
 

         int multiply[][] = new int[m][q];
 
       
 
         for ( c = 0 ; c < m ; c++ )
         {
            for ( d = 0 ; d < q ; d++ )
            {   
               for ( k = 0 ; k < p ; k++ )
               {
                  sum = sum + first[c][k]*second[k][d];
               }
 
               multiply[c][d] = sum;
               sum = 0;
            }
         }
 
   
     return multiply;
      
   }
    
    
    
    
    
    
    
     @Test
    public void multiply() {
         
         int A [][]=  {{1,1},{1,1}};
         int B [][]=  {{1,1},{1,1}};
         int C [][]=  {{2,2},{2,2}};
         
         assertArrayEquals(C, product(A, B,2,2,2,2));
         
    }
}
