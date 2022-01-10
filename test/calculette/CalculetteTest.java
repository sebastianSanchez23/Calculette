/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculette;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pollo
 */
public class CalculetteTest {

    public CalculetteTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of sum method, of class Calculette.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int n1 = 8;
        int n2 = 6;
        Calculette instance = new Calculette();
        int expResult = 0;
        int result = instance.sum(n1, n2);
        System.out.println(n1 + "+" + n2 + "= " + result);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of rest method, of class Calculette.
     */
    @Test
    public void testRest() {
        System.out.println("rest");
        int n1 = 10;
        int n2 = 4;
        Calculette instance = new Calculette();
        int expResult = 0;
        int result = instance.rest(n1, n2);
        //assertEquals(expResult, result);
        System.out.println(n1 + "-" + n2 + "= " + result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of div method, of class Calculette.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        int n1 = 8;
        int n2 = 2;
        Calculette instance = new Calculette();
        // double expResult = 0.0;
        double result = instance.div(n1, n2);
//        assertEquals(expResult, result, 0.0);
        System.out.println(n1 + "/" + n2 + "= " + result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of multi method, of class Calculette.
     */
    @Test
    public void testMulti() {
        System.out.println("multi");
        int n1 = 0;
        int n2 = 0;
        Calculette instance = new Calculette();
        int expResult = 0;
        int result = instance.multi(n1, n2);
        System.out.println(n1 + "*" + n2 + "= " + result);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
