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
public class FrameTest {
    
    public FrameTest() {
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
     * Test of setLevel method, of class Frame.
     */
    @Test
    public void testSetLevel() {
        System.out.println("setLevel");
        int level = 0;
        Frame instance = new Frame();
        instance.setLevel(level);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of volgende method, of class Frame.
     */
    @Test
    public void testVolgende() {
        System.out.println("volgende");
        Frame instance = new Frame();
        instance.volgende();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of herstart method, of class Frame.
     */
    @Test
    public void testHerstart() {
        System.out.println("herstart");
        Frame instance = new Frame();
        instance.herstart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buttonClicked method, of class Frame.
     */
    @Test
    public void testButtonClicked() {
        System.out.println("buttonClicked");
        int lvl = 0;
        Frame instance = new Frame();
        instance.buttonClicked(lvl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
