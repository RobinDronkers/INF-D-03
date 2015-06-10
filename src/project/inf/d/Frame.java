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
    JPanel levelButtonPanel;
    
    public Frame() {        
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(410, 470);
        setVisible(true);

        levelButtonPanel = new JPanel();
        levelButtonPanel.setBackground(Color.black);
        levelButtonPanel.setFocusable(false);
        add(levelButtonPanel);
        
        this.setResizable(false);
        
        int posy = 95;
        for (i = 1; i < 4; i++) {
            levelButtonPanel.add(new LevelButton(i, this, posy));
            
            posy = posy + 70;
            
        }
    }
    
    public void setLevel(int level) {
        buttonClicked(level);
    }
    
    public void volgende(){
        doolhof.volgende();
    }
    
    public void herstart(){
        doolhof.herstart();
    }
    
    public void buttonClicked(int lvl) {
        levelButtonPanel.setVisible(false);
        
        
        controlPanel = new Panel(this);
        this.counter=controlPanel.counter;
        doolhof = new Doolhof(lvl,counter);
        doolhof.setBounds(0, 35, 400, 400);
        //pnl.setBounds(0, 0, 400, 25);
        
        add(doolhof);
        add(controlPanel);
        doolhof.requestFocus();
        //level.buttonClicked();

    }
}

