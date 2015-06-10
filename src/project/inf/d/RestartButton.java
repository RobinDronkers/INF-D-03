/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.inf.d;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Robin
 */
public class RestartButton extends JButton {

    int height = 25;
    int width = 150;
    int posx;
    int posy;
    Frame frame;

    public RestartButton(int posx, int posy, Frame frame) {
        this.frame = frame;
        this.posx = posy;
        this.posy = posy;
        this.setBounds(posx, posy, width, height);
        this.setText("Restart");
        setVisible(true);
        this.setFocusable(false);
        ButtonPressed();
                
    }
    
    public void ButtonPressed() {

        this.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //Execute when button is pressed
                System.out.println("button pressed!");
                frame.herstart();
            }
        });
    }
}
