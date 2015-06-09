/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.inf.d;

/**
 *
 * @author Robin
 */
public abstract class Item {
    
    public abstract ItemSoort getType();
    
    Veld veld;
    
    
    
    public boolean Loopbaar() {
        return true;
    }
    
    public void verdwijn(){
        this.veld.verwijderItem();
    }

    public void setVeld(Veld veld) {
        this.veld = veld;
    }

    public Veld getVeld() {
        return veld;
    }
    
    public void wordBeschoten() {

    }
    public void interactWith(Item it) {

    }
}
