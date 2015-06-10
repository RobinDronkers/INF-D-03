/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.inf.d;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import project.inf.d.Doolhof;
/**
 *
 * @author Robin
 */
public class LevelButton extends JButton {
    int x = 35;
    int y = 200;
    int level;
    int posx = 95;
    int posy;
    

    public LevelButton(final int lvl, final Frame frame, int posy) {
        setVisible(true);
        this.posy = posy;
        this.setBounds(posx, posy, y, x);
        this.setText("Level " + lvl);
        this.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //Execute when button is pressed
                System.out.println("You clicked the button "+ lvl);
                frame.setLevel(lvl);
                
                
            }
        });
    }
}
