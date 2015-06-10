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
    BeweegBaar beweegbaar;
    boolean wapen = false;

    public Speler(Doolhof doolhof) {
        this.doolhof = doolhof;
    }
    
    @Override
    public ItemSoort getType() {
        return ItemSoort.Speler;
    }
    
    public void vuurBazooka(){
        if(wapen){
            getVeld().getNeighboor(laatsteRichting).wordBeschoten();
            wapen =false;
        }
    }
    
    public void setWapen() {
        wapen = true;
    }
        
    //werkt niet moet nog aangepast worden
    public void beweeg(Richting r){
    if (laatsteRichting == r) {
            this.Beweeg(r);
        }
        laatsteRichting = r;
    }
    
    public void Beweeg(Richting r){
        veld.beweegItem(r);
    }
    
    public void setRichting(Richting r) {
        laatsteRichting = r;
    }
    
    public Richting getLastRi() {
        return laatsteRichting;
    }
    
    public void verhoogMunutie(){
        
    }
    
    public void verhoogStappen(){
        //moet nog dynamisch gemaakt worden, momenteel is het maar -1 stap
        doolhof.counter.CounterValsspeler();
    }
}
