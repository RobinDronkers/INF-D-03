/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.inf.d;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author Bart
 */
public class Frame extends JFrame {
    
    int lvl = 1;
    int i;
    Panel controlPanel;
    Counter counter;
    Doolhof doolhof;
    
    public Frame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(410, 470);
        setVisible(true);
        this.setResizable(false);
        
        controlPanel = new Panel(this);
        this.counter=controlPanel.counter;
        doolhof = new Doolhof(1,counter);
        doolhof.setBounds(0, 35, 400, 400);
        //pnl.setBounds(0, 0, 400, 25);
        
        add(doolhof);
        add(controlPanel);
        doolhof.requestFocus();
        
    }
    
    public void setLevel() {
        
    }
    
    public void herstart(){
        doolhof.herstart();
    }
}

