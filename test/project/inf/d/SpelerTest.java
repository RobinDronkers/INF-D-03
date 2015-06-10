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
public class SpelerTest {
    
    public SpelerTest() {
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
     * Test of getType method, of class Speler.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Speler instance = null;
        ItemSoort expResult = null;
        ItemSoort result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vuurBazooka method, of class Speler.
     */
    @Test
    public void testVuurBazooka() {
        System.out.println("vuurBazooka");
        Speler instance = null;
        instance.vuurBazooka();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWapen method, of class Speler.
     */
    @Test
    public void testSetWapen() {
        System.out.println("setWapen");
        Speler instance = null;
        instance.setWapen();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of beweeg method, of class Speler.
     */
    @Test
    public void testBeweeg_1args_1() {
        System.out.println("beweeg");
        Richting r = null;
        Speler instance = null;
        instance.beweeg(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Beweeg method, of class Speler.
     */
    @Test
    public void testBeweeg_1args_2() {
        System.out.println("Beweeg");
        Richting r = null;
        Speler instance = null;
        instance.Beweeg(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRichting method, of class Speler.
     */
    @Test
    public void testSetRichting() {
        System.out.println("setRichting");
        Richting r = null;
        Speler instance = null;
        instance.setRichting(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastRi method, of class Speler.
     */
    @Test
    public void testGetLastRi() {
        System.out.println("getLastRi");
        Speler instance = null;
        Richting expResult = null;
        Richting result = instance.getLastRi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verhoogMunutie method, of class Speler.
     */
    @Test
    public void testVerhoogMunutie() {
        System.out.println("verhoogMunutie");
        Speler instance = null;
        instance.verhoogMunutie();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verlaagStappen method, of class Speler.
     */
    @Test
    public void testVerlaagStappen() {
        System.out.println("verlaagStappen");
        Speler instance = null;
        instance.verhoogStappen();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
