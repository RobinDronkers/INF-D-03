/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.inf.d;

/**
 *
 * @author Robin
 */
public class Bazooka extends Item {
    
    @Override
    public ItemSoort getType() {
        return ItemSoort.Bazooka;
    }
    
    @Override
    public void interactWith(Item it) {
        Speler speler = (Speler)it;
        speler.setWapen();
    }
    
    @Override
    public void wordBeschoten(){
        verdwijn();
    }
}
