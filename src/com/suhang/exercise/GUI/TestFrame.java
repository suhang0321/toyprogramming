package com.suhang.exercise.GUI;

import java.awt.*;

/**
 * @author hang.su
 * @since 2017-04-06 13:50
 */
public class TestFrame {
    public static void main(String[] args) {
        Frame f = new Frame("My first frame");
        f.setSize(170, 100);
        f.setLocation(300,300);
        f.setBackground(Color.blue);
        f.setResizable(false);
        f.setVisible(true);
    }
}
