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
public class ItemSoortTest {
    
    public ItemSoortTest() {
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
     * Test of values method, of class ItemSoort.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        ItemSoort[] expResult = null;
        ItemSoort[] result = ItemSoort.values();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class ItemSoort.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        ItemSoort expResult = null;
        ItemSoort result = ItemSoort.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}