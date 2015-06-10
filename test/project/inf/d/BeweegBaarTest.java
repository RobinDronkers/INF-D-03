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
public class BeweegBaarTest {
    
    public BeweegBaarTest() {
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
     * Test of Move method, of class BeweegBaar.
     */
    @Test
    public void testMove() {
        System.out.println("Move");
        Richting r = null;
        BeweegBaar instance = new BeweegBaarImpl();
        instance.Move(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of interactWith method, of class BeweegBaar.
     */
    @Test
    public void testInteractWith() {
        System.out.println("interactWith");
        Item go = null;
        BeweegBaar instance = new BeweegBaarImpl();
        instance.interactWith(go);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BeweegBaarImpl extends BeweegBaar {

        public void interactWith(Item go) {
        }
    }
}
