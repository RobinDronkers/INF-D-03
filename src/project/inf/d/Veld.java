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
    
    public void addNeighboor(Richting r, Veld v) {
        veldMap.put(r, v);
    }

    public Veld getNeighboor(Richting r) {
        return veldMap.get(r);
    }

    public Item getItem() {
        return item;
    }
    
    public void beweegItem(Richting r) {
        if (getBuurVeld(r).loopBaar()) {

            getBuurVeld(r).interactObjects(item);
            getBuurVeld(r).voegItemToe(item);
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
    
     public Veld LagereAfstandBuur() {

        Veld veld = new Veld(0, 0);
        veld.distance = Integer.MAX_VALUE;

        for (Map.Entry<Richting, Veld> veldEntry : veldMap.entrySet()) {
            if (distance != 1) {
                if (veldEntry.getValue().distance != 0 && veldEntry.getValue().distance < veld.distance) {
                    veld = veldEntry.getValue();
                }
            }
            else{
                if(veldEntry.getValue().distance<veld.distance){
                    veld = veldEntry.getValue();
                }
            }
        }

        return veld;

    }
     
     public void maakPad() {
        

        System.out.println(distance);
        if (distance != 0) {
            LagereAfstandBuur().maakPad();
            if (item == null) {
                voegItemToe(new HelperPad());
            }
        }
    }
}
