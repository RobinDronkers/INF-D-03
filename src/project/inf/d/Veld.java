/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.inf.d;

import java.util.EnumMap;
import java.util.Map;
/**
 *
 * @author Robin
 */
public class Veld {
    public String type;
    
    int distance = 0;
    Boolean visible = true;

    Item item;
    int x, y;

    Map<Richting, Veld> veldMap = new EnumMap(Richting.class);

    public Veld(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void voegItemToe(Item go) {
        item = go;
        item.setVeld(this);
        if (go.getType() == ItemSoort.Speler) {
            setVisible(true);
            for (Map.Entry<Richting, Veld> veldEntry : veldMap.entrySet()) {
                veldEntry.getValue().setVisible(true);
            }

        }
    }
    
    public void beweegItem(Richting r) {
        if (getBuurVeld(r).loopBaar()) {

            getBuurVeld(r).interactObjects(item);
            getBuurVeld(r).addObject(item);
            verwijderItem();

        }
    }
    
    public void interactObjects(Item it) {
        if (item != null) {
            item.interactWith(it);
        }
    }
    
    public boolean loopBaar() {
        if (item == null) {
            return true;
        } else {
            return item.Loopbaar();
        }
    }
    
    public void verwijderItem() {
        item = null;
    }
    
    public Map<Richting, Veld> getVeldMap() {

        return veldMap;

    }
    
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Boolean getVisible() {
        return visible;
    }
    
    public void addBuurVeld(Richting r, Veld v) {
        veldMap.put(r, v);
    }

    public Veld getBuurVeld(Richting r) {
        return veldMap.get(r);
    }

    public Item getObject() {
        return item;
    }
}
