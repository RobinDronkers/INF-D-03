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
public class HelperPadTest {
    
    public HelperPadTest() {
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
     * Test of getType method, of class HelperPad.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        HelperPad instance = new HelperPad();
        ItemSoort expResult = null;
        ItemSoort result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of interactWith method, of class HelperPad.
     */
    @Test
    public void testInteractWith() {
        System.out.println("interactWith");
        Item it = null;
        HelperPad instance = new HelperPad();
        instance.interactWith(it);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
