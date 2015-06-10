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
public class HelperTest {
    
    public HelperTest() {
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
     * Test of getType method, of class Helper.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Helper instance = null;
        ItemSoort expResult = null;
        ItemSoort result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of interactWith method, of class Helper.
     */
    @Test
    public void testInteractWith() {
        System.out.println("interactWith");
        Item It = null;
        Helper instance = null;
        instance.interactWith(It);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wordBeschoten method, of class Helper.
     */
    @Test
    public void testWordBeschoten() {
        System.out.println("wordBeschoten");
        Helper instance = null;
        instance.wordBeschoten();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
