/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.inf.d;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
/**
 *
 * @author Robin
 */
public class NextLevelButton extends JButton {
    
    int height = 25;
    int width = 150;
    int posx;
    int posy;
    Frame frame;

    public NextLevelButton(int posx, int posy, Frame frame) {
        this.frame = frame;
        this.posx = posy;
        this.posy = posy;
        this.setBounds(posx, posy, width, height);
        this.setText("Volgende");
        setVisible(true);
        this.setFocusable(false);
        ButtonPressed();
    }

    public void ButtonPressed() {
        
    }
}
