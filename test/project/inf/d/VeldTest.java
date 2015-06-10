/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.inf.d;

import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author dunyamin
 */
public class VeldTest {
    
    public VeldTest() {
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
     * Test of voegItemToe method, of class Veld.
     */
    @Test
    public void testVoegItemToe() {
        System.out.println("voegItemToe");
        Item go = null;
        Veld instance = null;
        instance.voegItemToe(go);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNeighboor method, of class Veld.
     */
    @Test
    public void testAddNeighboor() {
        System.out.println("addNeighboor");
        Richting r = null;
        Veld v = null;
        Veld instance = null;
        instance.addNeighboor(r, v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNeighboor method, of class Veld.
     */
    @Test
    public void testGetNeighboor() {
        System.out.println("getNeighboor");
        Richting r = null;
        Veld instance = null;
        Veld expResult = null;
        Veld result = instance.getNeighboor(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItem method, of class Veld.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        Veld instance = null;
        Item expResult = null;
        Item result = instance.getItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of beweegItem method, of class Veld.
     */
    @Test
    public void testBeweegItem() {
        System.out.println("beweegItem");
        Richting r = null;
        Veld instance = null;
        instance.beweegItem(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of interactObjects method, of class Veld.
     */
    @Test
    public void testInteractObjects() {
        System.out.println("interactObjects");
        Item it = null;
        Veld instance = null;
        instance.interactObjects(it);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loopBaar method, of class Veld.
     */
    @Test
    public void testLoopBaar() {
        System.out.println("loopBaar");
        Veld instance = null;
        boolean expResult = false;
        boolean result = instance.loopBaar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verwijderItem method, of class Veld.
     */
    @Test
    public void testVerwijderItem() {
        System.out.println("verwijderItem");
        Veld instance = null;
        instance.verwijderItem();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVeldMap method, of class Veld.
     */
    @Test
    public void testGetVeldMap() {
        System.out.println("getVeldMap");
        Veld instance = null;
        Map expResult = null;
        Map result = instance.getVeldMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVisible method, of class Veld.
     */
    @Test
    public void testSetVisible() {
        System.out.println("setVisible");
        Boolean visible = null;
        Veld instance = null;
        instance.setVisible(visible);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVisible method, of class Veld.
     */
    @Test
    public void testGetVisible() {
        System.out.println("getVisible");
        Veld instance = null;
        Boolean expResult = null;
        Boolean result = instance.getVisible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBuurVeld method, of class Veld.
     */
    @Test
    public void testAddBuurVeld() {
        System.out.println("addBuurVeld");
        Richting r = null;
        Veld v = null;
        Veld instance = null;
        instance.addBuurVeld(r, v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuurVeld method, of class Veld.
     */
    @Test
    public void testGetBuurVeld() {
        System.out.println("getBuurVeld");
        Richting r = null;
        Veld instance = null;
        Veld expResult = null;
        Veld result = instance.getBuurVeld(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObject method, of class Veld.
     */
    @Test
    public void testGetObject() {
        System.out.println("getObject");
        Veld instance = null;
        Item expResult = null;
        Item result = instance.getObject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LagereAfstandBuur method, of class Veld.
     */
    @Test
    public void testLagereAfstandBuur() {
        System.out.println("LagereAfstandBuur");
        Veld instance = null;
        Veld expResult = null;
        Veld result = instance.LagereAfstandBuur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maakPad method, of class Veld.
     */
    @Test
    public void testMaakPad() {
        System.out.println("maakPad");
        Veld instance = null;
        instance.maakPad();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wordBeschoten method, of class Veld.
     */
    @Test
    public void testWordBeschoten() {
        System.out.println("wordBeschoten");
        Veld instance = null;
        instance.wordBeschoten();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
