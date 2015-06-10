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
public class ItemTest {
    
    public ItemTest() {
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
     * Test of getType method, of class Item.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Item instance = new ItemImpl();
        ItemSoort expResult = null;
        ItemSoort result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Loopbaar method, of class Item.
     */
    @Test
    public void testLoopbaar() {
        System.out.println("Loopbaar");
        Item instance = new ItemImpl();
        boolean expResult = false;
        boolean result = instance.Loopbaar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verdwijn method, of class Item.
     */
    @Test
    public void testVerdwijn() {
        System.out.println("verdwijn");
        Item instance = new ItemImpl();
        instance.verdwijn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVeld method, of class Item.
     */
    @Test
    public void testSetVeld() {
        System.out.println("setVeld");
        Veld veld = null;
        Item instance = new ItemImpl();
        instance.setVeld(veld);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVeld method, of class Item.
     */
    @Test
    public void testGetVeld() {
        System.out.println("getVeld");
        Item instance = new ItemImpl();
        Veld expResult = null;
        Veld result = instance.getVeld();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wordBeschoten method, of class Item.
     */
    @Test
    public void testWordBeschoten() {
        System.out.println("wordBeschoten");
        Item instance = new ItemImpl();
        instance.wordBeschoten();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of interactWith method, of class Item.
     */
    @Test
    public void testInteractWith() {
        System.out.println("interactWith");
        Item it = null;
        Item instance = new ItemImpl();
        instance.interactWith(it);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ItemImpl extends Item {

        public ItemSoort getType() {
            return null;
        }
    }
}
