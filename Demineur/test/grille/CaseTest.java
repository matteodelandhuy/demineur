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
public class CaseTest {

    public CaseTest() {
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
     * Test of get_decouvert method, of class Case.
     */
    @Test
    public void testGet_decouvert()
    {
        System.out.println("get_decouvert");
        Case instance = null;
        boolean expResult = false;
        boolean result = instance.get_decouvert();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decouvrir method, of class Case.
     */
    @Test
    public void testDecouvrir()
    {
        System.out.println("decouvrir");
        Case instance = null;
        instance.decouvrir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_drapeau method, of class Case.
     */
    @Test
    public void testGet_drapeau()
    {
        System.out.println("get_drapeau");
        Case instance = null;
        boolean expResult = false;
        boolean result = instance.get_drapeau();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_drapeau method, of class Case.
     */
    @Test
    public void testSet_drapeau()
    {
        System.out.println("set_drapeau");
        boolean choix = false;
        Case instance = null;
        instance.set_drapeau(choix);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_mine method, of class Case.
     */
    @Test
    public void testGet_mine()
    {
        System.out.println("get_mine");
        Case instance = null;
        boolean expResult = false;
        boolean result = instance.get_mine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Case.
     */
    @Test
    public void testToString()
    {
        System.out.println("toString");
        Case instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}