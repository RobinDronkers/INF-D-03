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
public class VriendTest {
    
    public VriendTest() {
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
     * Test of getType method, of class Vriend.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Vriend instance = null;
        ItemSoort expResult = null;
        ItemSoort result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of interactWith method, of class Vriend.
     */
    @Test
    public void testInteractWith() {
        System.out.println("interactWith");
        Item it = null;
        Vriend instance = null;
        instance.interactWith(it);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
