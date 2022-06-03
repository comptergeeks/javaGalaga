package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyFrame extends JFrame implements KeyListener { // implement the KeyListener interface in Java
    JLabel xWing;
    JLabel label2;
    int xWingStartX = 500;
    int xWingStartY = 475;

    boolean isSpace = false;
    //int vX = 0;
    ImageIcon icon2;
    // 'this' refers to the frame 'MyFrame'
    MyFrame() { // defining the frame panel

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // how the frame should close: closes when program terminates
        this.setSize(1000, 1000); // panel size
        this.setLayout(null); // want to set the layout to null because Galaga requires moving object
        this.addKeyListener(this); // need a key listener to check for input
        this.getContentPane().setBackground(Color.BLACK);
        xWing = new JLabel();
        xWing.setBounds(xWingStartX, xWingStartY, 250, 250);
        xWing.setIcon(new ImageIcon(new ImageIcon("/Users/farhankhan/IdeaProjects/javaGalaga/src/com/company/assets/spaceship/825b97a70a5f0ccdc56f4c3ea9ec19f1.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
        this.add(xWing);
        label2 = new JLabel();
        icon2 = new ImageIcon("/Users/farhankhan/IdeaProjects/javaGalaga/src/com/company/assets/tiefighter/2f59052965679a572d479002bff8bef9.png");
        label2.setBounds(0, 0, 250, 250);
        label2.setIcon(icon2);
        this.add(label2);



        this.setVisible(true); // makes object appear on screen
    }

    @Override
    public void keyTyped(KeyEvent e) { // keyTyped = Invoked when a key is typed. Uses Keychar, and outputs char

    }

    @Override
    public void keyPressed(KeyEvent e) {// keyPressed = Invoked when a physical key is pressed down. Uses keycode and outputs an int
        /*
            if(e.getKeyCode() == KeyEvent.VK_A) {
                xWing.setBounds(movement(-10), xWing.getY(), 250, 250);
            }
        if(e.getKeyCode() == KeyEvent.VK_D) {
            xWing.setBounds(movement(10), xWing.getY(), 250, 250);
        }
         */
        if(e.getKeyCode() == KeyEvent.VK_A) {
            xWing.setBounds(xWingStartX -= 10, xWing.getY(), 250, 250);
        }
        if(e.getKeyCode() == KeyEvent.VK_D) {
            xWing.setBounds(xWingStartX += 10, xWing.getY(), 250, 250);
        }
        }

    @Override
    public void keyReleased(KeyEvent e) {
        /*
        if(e.getKeyCode() == KeyEvent.VK_A) {
            xWing.setBounds(movement(0), xWing.getY(), 250, 250);
        }// keyReleased = called whenever a button is released
        if(e.getKeyCode() == KeyEvent.VK_D) {
            xWing.setBounds(movement(0), xWing.getY(), 250, 250);
        }
         */
        if(e.getKeyCode() == KeyEvent.VK_A) {
            xWingStartX -= 10;
            xWing.setBounds(xWingStartX, xWing.getY(), 250, 250);
        }
        if(e.getKeyCode() == KeyEvent.VK_D) {
            xWingStartY += 10;
            xWing.setBounds(xWingStartY, xWing.getY(), 250, 250);
        }
        if(e.getKeyCode() == KeyEvent.VK_SPACE) {
            isSpace = true;
            Bullet bullet = new Bullet();
        }
        repaint();

    }
    public int movement (int velocityX) {
        return xWingStartX += velocityX;
    }

}