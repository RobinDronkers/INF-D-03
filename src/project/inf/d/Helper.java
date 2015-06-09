/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.inf.d;

/**
 *
 * @author Robin
 */
public class Helper extends Item {
    
    Doolhof Doolhof;

    public Helper(Doolhof Doolhof) {
        this.Doolhof = Doolhof;
    }
    
    @Override
    public ItemSoort getType() {
        return ItemSoort.Helper;
    }
    
    @Override
    public void interactWith(Item It) {
        Doolhof.vindPad();

    }
}
