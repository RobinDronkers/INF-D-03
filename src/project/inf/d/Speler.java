/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.inf.d;

/**
 *
 * @author Robin
 */
public class Speler extends Item {
    public int aantalStappen;
    public int munutie;
    
    Richting laatsteRichting = Richting.Down;
    Doolhof doolhof;
    boolean weapon = false;

    public Speler(Doolhof doolhof) {
        this.doolhof = doolhof;
    }
    
    @Override
    public ItemSoort getType() {
        return ItemSoort.Speler;
    }
    
    public void vuurBazooka(){
        
    }
    
    public void beweeg(){
        
    }
    
    public void verhoogMunutie(){
        
    }
    
    public void verlaagStappen(){
        
    }
}
