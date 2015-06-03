/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.inf.d;

/**
 *
 * @author Robin
 */
public abstract class BeweegBaar extends Item {
    
    public void Move(Richting r){
        veld.beweegItem(r);
    }
    
    @Override
    public abstract void interactWith(Item go);
    
}
