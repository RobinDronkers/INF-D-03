/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.inf.d;

/**
 *
 * @author Robin
 */
public class Valsspeler extends Item {
    
        Speler Speler;

    public Valsspeler(Speler Speler) {
        this.Speler = Speler;
    }
    
    @Override
    public ItemSoort getType() {
        return ItemSoort.Valsspeler;
    }
    
    public void zetStappenTerug(){
        Speler.verlaagStappen();
    }
    
    @Override
    public void wordBeschoten(){
        verdwijn();
    }
}
