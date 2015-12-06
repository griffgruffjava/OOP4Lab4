/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Finbar
 */
public class Lab4ATest
{
    
    public Lab4ATest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of isBalanced method, of class Lab4A.
     */
    @Test
    public void testIsBalanced()
    {
        System.out.println("isBalanced");
        String expression1 = "[10+7-(33-4)*(4/3)]*3";
        String expression2 = "10+7-(33-4)*4/3)]*3";
        String expression3 = "(2+[5+7]+1)";
        String expression4 = "2+7*3";
        
        Lab4A instance1 = new Lab4A();
        boolean expResult = true;
        boolean result1 = instance1.isBalanced(expression1);
        assertEquals(expResult, result1);
        
        Lab4A instance2 = new Lab4A();
        expResult = false;
        boolean result2 = instance2.isBalanced(expression2);
        assertEquals(expResult, result2);
        
        Lab4A instance3 = new Lab4A();
        expResult = true;
        boolean result3 = instance3.isBalanced(expression3);
        assertEquals(expResult, result3);
        
        Lab4A instance4 = new Lab4A();
        expResult = true;
        boolean result4 = instance4.isBalanced(expression4);
        assertEquals(expResult, result4);
    }
    
}
