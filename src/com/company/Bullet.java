package com.company;

import javax.swing.*;
import java.awt.*;

public class Bullet extends MyFrame {
    public double velocity;
    public int x;
    public int y;
    JLabel bullet;
    public void spacePressed() {
        if (isSpace == true) {
            System.out.println("released");
            bullet.setIcon(new ImageIcon(new ImageIcon("/Users/farhankhan/IdeaProjects/javaGalaga/src/com/company/assets/bullet/a2e2d88b7e3c6b538202b3a7855a6290.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
            bullet.setVisible(true);
            x = xWing.getX();
            y = xWing.getY();
            bullet.setBounds(x, y, 250, 250);

        }


    }

}
