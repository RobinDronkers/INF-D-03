/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.inf.d;

import java.awt.Graphics;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author dunyamin
 */
public class DoolhofTest {
    
    public DoolhofTest() {
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
     * Test of paintComponent method, of class Doolhof.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        Doolhof instance = null;
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initveldArray method, of class Doolhof.
     */
    @Test
    public void testInitveldArray() {
        System.out.println("initveldArray");
        Doolhof instance = null;
        instance.initveldArray();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Keypressed method, of class Doolhof.
     */
    @Test
    public void testKeypressed() {
        System.out.println("Keypressed");
        Doolhof instance = null;
        instance.Keypressed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vindPad method, of class Doolhof.
     */
    @Test
    public void testVindPad() {
        System.out.println("vindPad");
        Doolhof instance = null;
        instance.vindPad();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVeldMetLaagsteAfstand method, of class Doolhof.
     */
    @Test
    public void testGetVeldMetLaagsteAfstand() {
        System.out.println("getVeldMetLaagsteAfstand");
        ArrayList<Veld> list = null;
        Doolhof instance = null;
        Veld expResult = null;
        Veld result = instance.getVeldMetLaagsteAfstand(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLvl method, of class Doolhof.
     */
    @Test
    public void testAddLvl() {
        System.out.println("addLvl");
        Doolhof instance = null;
        instance.addLvl();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVeldArray method, of class Doolhof.
     */
    @Test
    public void testGetVeldArray() {
        System.out.println("getVeldArray");
        Doolhof instance = null;
        Veld[][] expResult = null;
        Veld[][] result = instance.getVeldArray();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startSpel method, of class Doolhof.
     */
    @Test
    public void testStartSpel() {
        System.out.println("startSpel");
        Doolhof instance = null;
        instance.startSpel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of volgende method, of class Doolhof.
     */
    @Test
    public void testVolgende() {
        System.out.println("volgende");
        Doolhof instance = null;
        instance.volgende();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of herstart method, of class Doolhof.
     */
    @Test
    public void testHerstart() {
        System.out.println("herstart");
        Doolhof instance = null;
        instance.herstart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vuurSpelerWapen method, of class Doolhof.
     */
    @Test
    public void testVuurSpelerWapen() {
        System.out.println("vuurSpelerWapen");
        Doolhof instance = null;
        instance.vuurSpelerWapen();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maakPad method, of class Doolhof.
     */
    @Test
    public void testMaakPad() {
        System.out.println("maakPad");
        Doolhof instance = null;
        instance.maakPad();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
