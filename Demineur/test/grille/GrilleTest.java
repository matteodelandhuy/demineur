/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grille;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maxbook
 */
public class GrilleTest {

    public GrilleTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
    }

    @AfterClass
    public static void tearDownClass() throws Exception
    {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of length method, of class Grille.
     */
    @Test
    public void testLength()
    {
        System.out.println("length");
        Grille instance = new Grille();
        int expResult = 0;
        int result = instance.length();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Grille.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        Grille instance = new Grille();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Grille.
     */
    @Test
    public void testMain()
    {
        System.out.println("main");
        String[] args = null;
        Grille.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}