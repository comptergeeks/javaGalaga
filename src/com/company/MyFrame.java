package com.company;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class MyFrame extends JFrame implements KeyListener { // implement the KeyListener interface in Java

    JLabel label1;
    JLabel label2;

    ImageIcon icon1;
    ImageIcon icon2;
    // 'this' refers to the frame 'MyFrame'
    MyFrame() { // defining the frame panel
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // how the frame should close: closes when program terminates
        this.setSize(1920, 1080); // panel size
        this.setLayout(null); // want to set the layout to null because Galaga requires moving oject
        this.addKeyListener(this); // need a key listener to check for input
        this.getContentPane().setBackground(Color.BLACK);


        icon1 = new ImageIcon("Spaceship.png");

        label1 = new JLabel();
        label1.setBounds(960, 500, 500, 500);
        label1.setIcon(icon1);
        this.add(label1);

        label2 = new JLabel();
        icon2 = new ImageIcon("Fighter.png");
        label2.setBounds(0, 0, 250, 250);
        label2.setIcon(icon2);
        this.add(label2);


        this.setVisible(true); // makes object appear on screen
    }

    @Override
    public void keyTyped(KeyEvent e) { // keyTyped = Invoked when a key is typed. Uses Keychar, and outputs char

    }

    @Override
    public void keyPressed(KeyEvent e) { // keyPressed = Invoked when a physical key is pressed down. Uses keycode and outputs an int
        System.out.println(e.getKeyCode());
        switch (e.getKeyCode()) {
            case 37 -> label1.setLocation(label1.getX() - 10, label1.getY());
            case 39 -> label1.setLocation(label1.getX() + 10, label1.getY());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) { // keyReleased = called whenever a button is released

    }
}