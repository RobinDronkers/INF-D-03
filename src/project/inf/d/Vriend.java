/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.inf.d;

/**
 *
 * @author Robin
 */
public class Vriend extends Item {
    
    Doolhof doolhof;

    public Vriend(Doolhof doolhof){
        this.doolhof = doolhof;
    }
    
    @Override
    public ItemSoort getType() {
        return ItemSoort.Vriend;
    }
    
}
