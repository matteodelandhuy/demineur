/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package divers;

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
public class MyExceptionTest {

    public MyExceptionTest() {
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
     * Test of get_messageErreur method, of class MyException.
     */
    @Test
    public void testGet_messageErreur()
    {
        System.out.println("get_messageErreur");
        MyException instance = null;
        String expResult = "";
        String result = instance.get_messageErreur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}