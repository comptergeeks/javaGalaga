package com.company;

import javax.swing.*;


public class MyFrame extends JFrame { // implement the KeyListener interface in Java
    
    MyFrame() { // defining the frame panel
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // how the frame should close: closes when program terminates
        this.setSize(500, 500); // panel size
        this.setLayout(null); // want to set the layout to null because Galaga requires moving
    }

}
