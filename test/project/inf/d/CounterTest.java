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
public class CounterTest {
    
    public CounterTest() {
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
     * Test of CounterTeller method, of class Counter.
     */
    @Test
    public void testCounterTeller() {
        System.out.println("CounterTeller");
        Counter instance = null;
        instance.CounterTeller();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CounterValsspeler method, of class Counter.
     */
    @Test
    public void testCounterValsspeler() {
        System.out.println("CounterValsspeler");
        Counter instance = null;
        instance.CounterValsspeler();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class Counter.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        Counter instance = null;
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
