/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.inf.d;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
/**
 *
 * @author Robin
 */
public class Doolhof extends javax.swing.JPanel {
    BufferedImage muurImage;
    BufferedImage helperImage;
    BufferedImage playerLeftImage;
    BufferedImage playerRightImage;
    BufferedImage playerUpImage;
    BufferedImage playerDownImage;
    BufferedImage vriendImage;
    BufferedImage bazookaImage;
    BufferedImage valsspelerImage;
    BufferedImage helperpadImage;
    int lvl;
    Speler speler;
    Counter counter;
    Vriend vriend;
    Valsspeler valsspeler;

    Veld[][] veldArray = new Veld[20][20];
    
    public Doolhof(int lvl, Counter counter) {

        this.lvl = lvl;
        this.counter = counter;
        
        this.setMaximumSize(new Dimension(400, 400));
        speler = new Speler(this);
        vriend = new Vriend(this);
        initveldArray();

        this.setVisible(true);
        setBackground(Color.black);
        loadImages();
        Keypressed();

        requestFocus();
        loadLevel();

    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("PAINT");

        for (int i = 0; i < veldArray.length; i++) {
            for (int j = 0; j < veldArray[0].length; j++) {
                if (veldArray[i][j].getObject() != null) {
                    if (veldArray[i][j].getVisible()) {
                        if (veldArray[i][j].getObject().getType() == ItemSoort.Speler) {

                            Speler player1 = (Speler) veldArray[i][j].getObject();
                            if (player1.getLastRi() == Richting.Down) {
                                g.drawImage(playerDownImage, i * 20, j * 20, null);
                            } else if (player1.getLastRi() == Richting.Left) {
                                g.drawImage(playerLeftImage, i * 20, j * 20, null);
                            } else if (player1.getLastRi() == Richting.Up) {
                                g.drawImage(playerUpImage, i * 20, j * 20, null);
                            } else if (player1.getLastRi() == Richting.Right) {
                                g.drawImage(playerRightImage, i * 20, j * 20, null);
                            }
                        } else if (veldArray[i][j].getObject().getType() == ItemSoort.Muur) {
                            g.drawImage(muurImage, i * 20, j * 20, null);
                        } else if (veldArray[i][j].getObject().getType() == ItemSoort.Helper) {
                            g.drawImage(helperImage, i * 20, j * 20, null);
                        } else if (veldArray[i][j].getObject().getType() == ItemSoort.HelperPad) {
                            g.drawImage(helperpadImage, i * 20, j * 20, null);
                        } else if (veldArray[i][j].getObject().getType() == ItemSoort.Vriend) {
                            g.drawImage(vriendImage, i * 20, j * 20, null);
                        } else if (veldArray[i][j].getObject().getType() == ItemSoort.Bazooka) {
                            g.drawImage(bazookaImage, i * 20, j * 20, null);
                        }
                    }
                }
            }
        }
    }
    
    private void loadImages() {
        try {
            playerLeftImage = ImageIO.read(new File("Player_Left.png"));
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            playerRightImage = ImageIO.read(new File("Player_Right.png"));
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            playerDownImage = ImageIO.read(new File("Player_Down.png"));
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            playerUpImage = ImageIO.read(new File("Player_Up.png"));
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            muurImage = ImageIO.read(new File("muur.png"));
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            helperImage = ImageIO.read(new File("Circle_small.png"));
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            vriendImage = ImageIO.read(new File("Circle.png"));
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            helperpadImage = ImageIO.read(new File("Circle_small.png"));
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            bazookaImage = ImageIO.read(new File("Bazooka.png"));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    // Maakt een nieuw veld class voor ieder veld in een doolhof
    public final void initveldArray() {
        for (Veld[] veldArray1 : veldArray) {
            for (int j = 0; j < veldArray[0].length; j++) {
                veldArray1[j] = new Veld(veldArray.length, veldArray[0].length);
            }
        }

        for (int i = 0; i < veldArray.length; i++) {
            for (int j = 0; j < veldArray[0].length; j++) {
                if (j > 0) {
                    veldArray[i][j].addBuurVeld(Richting.Up, veldArray[i][j - 1]);
                }
                if (i > 0) {
                    veldArray[i][j].addBuurVeld(Richting.Left, veldArray[i - 1][j]);
                }
                if (j < veldArray[0].length - 1) {
                    veldArray[i][j].addBuurVeld(Richting.Down, veldArray[i][j + 1]);
                }
                if (i < veldArray.length - 1) {
                    veldArray[i][j].addBuurVeld(Richting.Right, veldArray[i + 1][j]);
                }
            }
        }
        for (int i = 0; i < veldArray.length - 1; i++) {
            for (int j = 0; j < veldArray[0].length; j++) {
                veldArray[i][j].distance = Integer.MAX_VALUE;

            }

        }
    }
    
    public void Keypressed() {

        this.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                if ((e.getKeyCode() == KeyEvent.VK_UP)) {
                    System.out.println("woot!");

                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if ((e.getKeyCode() == KeyEvent.VK_UP)) {
                    //System.out.println("woot!");
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {
                    if ((e.getKeyCode() == KeyEvent.VK_UP)) {
                        System.out.println("UP!");

                        counter.CounterTeller();
                        speler.beweeg(Richting.Up);

                        repaint();
                    }
                    if ((e.getKeyCode() == KeyEvent.VK_RIGHT)) {
                        System.out.println("RIGHT!");

                        counter.CounterTeller();
                        speler.beweeg(Richting.Right);
                        
                        repaint();
                    }
                    if ((e.getKeyCode() == KeyEvent.VK_LEFT)) {
                        System.out.println("LEFT!");

                        counter.CounterTeller();
                        speler.beweeg(Richting.Left);
                        
                        repaint();

                    }
                    if ((e.getKeyCode() == KeyEvent.VK_DOWN)) {
                        System.out.println("DOWN!");

                        counter.CounterTeller();
                        speler.beweeg(Richting.Down);
                        
                        repaint();

                    }
            }
        });
    }
    
    private void loadLevel() {
        if (lvl == 1) {
            String[][] array = {
                {"W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W"},
                {"W", "P", "E", "W", "W", "o", "o", "o", "o", "o", "o", "o", "o", "W", "o", "o", "o", "o", "W", "W"},
                {"W", "o", "W", "W", "W", "o", "W", "W", "W", "W", "W", "W", "o", "W", "W", "o", "W", "o", "W", "W"},
                {"W", "o", "o", "W", "W", "o", "W", "W", "W", "W", "o", "o", "o", "o", "o", "o", "W", "o", "W", "W"},
                {"W", "W", "o", "W", "W", "o", "W", "W", "W", "W", "W", "W", "W", "o", "W", "W", "W", "o", "W", "W"},
                {"W", "o", "o", "W", "W", "o", "W", "W", "W", "W", "W", "Y", "W", "o", "W", "W", "W", "o", "W", "W"},
                {"W", "o", "W", "W", "W", "o", "o", "o", "W", "W", "W", "o", "W", "o", "W", "o", "W", "o", "W", "W"},
                {"W", "o", "W", "W", "W", "W", "W", "o", "W", "W", "W", "o", "W", "o", "W", "o", "W", "o", "o", "W"},
                {"W", "o", "o", "o", "o", "o", "o", "o", "o", "B", "W", "o", "o", "o", "o", "o", "W", "W", "o", "W"},
                {"W", "o", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "o", "W", "W", "W", "W", "W", "o", "W"},
                {"W", "H", "o", "W", "W", "W", "W", "W", "W", "W", "W", "W", "o", "W", "W", "W", "o", "o", "o", "W"},
                {"W", "W", "o", "W", "W", "W", "W", "W", "W", "W", "W", "W", "o", "W", "W", "W", "o", "W", "W", "W"},
                {"W", "o", "o", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "o", "o", "o", "W"},
                {"W", "o", "W", "o", "o", "o", "o", "o", "o", "o", "o", "W", "W", "W", "W", "W", "o", "W", "o", "W"},
                {"W", "o", "W", "W", "o", "W", "W", "W", "W", "W", "o", "W", "W", "o", "o", "o", "o", "o", "o", "W"},
                {"W", "o", "W", "W", "o", "o", "W", "o", "W", "W", "o", "W", "W", "W", "o", "W", "W", "W", "W", "W"},
                {"W", "o", "W", "W", "W", "o", "W", "o", "W", "o", "o", "W", "W", "W", "o", "W", "W", "W", "W", "W"},
                {"W", "o", "W", "W", "W", "o", "W", "o", "W", "o", "W", "W", "W", "W", "o", "o", "o", "o", "o", "W"},
                {"W", "o", "o", "o", "o", "o", "W", "o", "o", "o", "W", "W", "W", "W", "W", "W", "W", "W", "o", "W"},
                {"W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W", "W"}};
            readArray(array);
        }
    }
    
    private void readArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j].equals("W")) {
                    veldArray[array.length - 1 - i][j].voegItemToe(new Muur());
                }
                if (array[i][j].equals("P")) {
                    veldArray[array.length - 1 - i][j].voegItemToe(speler);
                }
                if (array[i][j].equals("H")) {
                    veldArray[array.length - 1 - i][j].voegItemToe(new Helper(this));
                }
                if (array[i][j].equals("E")) {
                    veldArray[array.length - 1 - i][j].voegItemToe(vriend);
                }
                if (array[i][j].equals("B")) {
                    veldArray[array.length - 1 - i][j].voegItemToe(new Bazooka());
                }
                if (array[i][j].equals("Y")) {
                    veldArray[array.length - 1 - i][j].voegItemToe(new Valsspeler(speler));
                }
            }
        }
    }
    
    private void evaluateNeighbors(Veld veld, ArrayList<Veld> visitedList, ArrayList<Veld> unvisitedList) {
        for (Map.Entry<Richting, Veld> destinationEntry : veld.getVeldMap().entrySet()) {
            if (destinationEntry.getValue() != null) {

                if (destinationEntry.getValue().loopBaar()) {

                    int edgeDistance = 1;
                    int newDistance = veld.distance + edgeDistance;
                    if (destinationEntry.getValue().distance > newDistance) {
                        destinationEntry.getValue().distance = newDistance;
                        unvisitedList.add(destinationEntry.getValue());
                    }

                }
            }
        }
    }
    
    public void vindPad() {

        System.out.println("VINDPAD");
        ArrayList<Veld> unvisitedList = new ArrayList();
        ArrayList<Veld> visitedList = new ArrayList();

        int maxDistance = Integer.MAX_VALUE;

        Veld sourcebox = speler.getVeld();
        sourcebox.distance = 0;
        unvisitedList.add(sourcebox);

        while (!unvisitedList.isEmpty()) {

            Veld huidigVeld = getVeldMetLaagsteAfstand(unvisitedList);

            unvisitedList.remove(huidigVeld);
            visitedList.add(huidigVeld);

            evaluateNeighbors(huidigVeld, visitedList, unvisitedList);

        }

        System.out.println("Done pathing");
        for (int i = 0; i < veldArray.length - 1; i++) {
            for (int j = 0; j < veldArray[0].length - 1; j++) {
                if (veldArray[i][j].distance != Integer.MAX_VALUE) {
                    if (veldArray[i][j].distance < 10) {
                        System.out.print(veldArray[i][j].distance + " ");
                    } else {
                        System.out.print(veldArray[i][j].distance);
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");

        }
        maakPad();

    }

    public Veld getVeldMetLaagsteAfstand(ArrayList<Veld> list) {

        int distance = Integer.MAX_VALUE;

        Veld returnVeld = null;

        for (Veld veld : list) {

            if (veld.distance < distance) {
                if (veld.loopBaar()) {
                    returnVeld = veld;
                }

            }

        }

        return returnVeld;

    }
    
    public void addLvl(){
        lvl++;
    }
    
    public Veld[][] getVeldArray() {

        return veldArray;
    }
    
    public void startSpel(){
        
    }
    
    public void herstart(){
        speler = new Speler(this);
        vriend = new Vriend(this);
        initveldArray();
        loadLevel();
        repaint();
        counter.reset();
    }
    
    public void beweegSpeler(){
        
    }
    
    public void vuurSpelerWapen(){
        
    }
    
    public void maakPad() {
        vriend.getVeld().maakPad();
    }
}
