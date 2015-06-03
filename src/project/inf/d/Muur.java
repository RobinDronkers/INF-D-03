/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.inf.d;

/**
 *
 * @author Robin
 */
public class Muur extends Item {
    
    @Override
    public ItemSoort getType() {
        return ItemSoort.Muur;
    }
    
    @Override
    public boolean Loopbaar(){
        return false;
    }
}
