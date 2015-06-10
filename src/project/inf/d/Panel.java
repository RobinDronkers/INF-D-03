/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.inf.d;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
/**
 *
 * @author Robin
 */
public class Panel extends JPanel {

    VolgendeButton volgende;
    RestartButton restart;
    Counter counter;

    public Panel(Frame frame) {
        // this.setMaximumSize(new Dimension(400, 400));
        this.setMinimumSize(new Dimension(500, 25));
        this.setBounds(0, 0, 500, 25);
        volgende = new VolgendeButton(0, 0,frame);
        restart = new RestartButton(150, 0, frame);
        counter = new Counter(300, 0);
        this.setBackground(Color.black);

        add(volgende);
        add(restart);
        add(counter);
        setVisible(true);
        
    }
}

