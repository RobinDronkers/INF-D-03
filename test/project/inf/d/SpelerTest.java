package project.inf.d;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import project.inf.d.*;

/**
 *
 * @author Robin
 */
public class SpelerTest {
    
    public SpelerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void WalkTest1(){
        Counter counter = new Counter(0, 0);
        Doolhof doolhof = new Doolhof(100, counter);
        Speler speler = doolhof.getSpeler();
        doolhof.getVeldArray()[10][10].voegItemToe(speler);
        Veld veld = speler.getVeld();
        speler.setRichting(Richting.Left);
        speler.beweeg(Richting.Left);
        
        assertEquals(veld.getNeighboor(Richting.Left).getObject(), speler);
        assertEquals(speler.getLastRi(), Richting.Left);
        
        
        
        
        
    }
    
    @Test
    public void WalkTest2(){
        Counter counter = new Counter(0, 0);
        Doolhof doolhof = new Doolhof(100, counter);
        Speler speler = doolhof.getSpeler();
        doolhof.getVeldArray()[10][10].voegItemToe(speler);
        Veld veld = speler.getVeld();
        speler.setRichting(Richting.Left);
        veld.getNeighboor(Richting.Left).voegItemToe(new Muur());
        speler.beweeg(Richting.Left);
        
        assertEquals(veld, speler.getVeld());
        assertEquals(speler.getLastRi(), Richting.Left);
        
        
        
        
        
    }
    @Test
    public void WalkTest3(){
        Counter counter = new Counter(0, 0);
        Doolhof doolhof = new Doolhof(100, counter);
        Speler speler = doolhof.getSpeler();
        doolhof.getVeldArray()[10][10].voegItemToe(speler);
        Veld veld = speler.getVeld();
        speler.setRichting(Richting.Right);
        speler.beweeg(Richting.Left);
        
        assertEquals(veld, speler.getVeld());
        assertEquals(speler.getLastRi(), Richting.Left);
        
    }
    @Test
    public void WalkTest4(){
        Counter counter = new Counter(0, 0);
        Doolhof doolhof = new Doolhof(100, counter);
        Speler speler = doolhof.getSpeler();
        doolhof.getVeldArray()[10][10].voegItemToe(speler);
        Veld veld = speler.getVeld();
        speler.setRichting(Richting.Left);
        speler.beweeg(Richting.Right);
        
        assertEquals(veld, speler.getVeld());
        assertEquals(speler.getLastRi(), Richting.Left);
        
        
        
    }
    
    @Test
    public void Shoot(){
        Counter counter = new Counter(0, 0);
        Doolhof doolhof = new Doolhof(100, counter);
        Speler speler = doolhof.getSpeler();
        doolhof.getVeldArray()[10][10].voegItemToe(speler);
        Veld veld = speler.getVeld();
        
        speler.setWapen();
        
        veld.getNeighboor(Richting.Left).voegItemToe(new Muur());
        speler.setRichting(Richting.Left);
        speler.vuurBazooka();
        
        assertEquals(veld.getNeighboor(Richting.Left).getObject(), null);
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
