/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.inf.d;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author dunyamin
 */
public class MuurTest {
    
    public MuurTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getType method, of class Muur.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Muur instance = new Muur();
        ItemSoort expResult = null;
        ItemSoort result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Loopbaar method, of class Muur.
     */
    @Test
    public void testLoopbaar() {
        System.out.println("Loopbaar");
        Muur instance = new Muur();
        boolean expResult = false;
        boolean result = instance.Loopbaar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wordBeschoten method, of class Muur.
     */
    @Test
    public void testWordBeschoten() {
        System.out.println("wordBeschoten");
        Muur instance = new Muur();
        instance.wordBeschoten();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
