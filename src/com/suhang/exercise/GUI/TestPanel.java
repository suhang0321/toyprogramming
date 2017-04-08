package com.suhang.exercise.GUI;

import java.awt.*;

/**
 * @author hang.su
 * @since 2017-04-06 14:16
 */
public class TestPanel {
    public static void main(String[] args){
        Frame f = new Frame("Java frame with panel");
        Panel p = new Panel(null);
        f.setLayout(null);
        f.setBounds(300,300,500,500);
        f.setBackground(new Color(0,0,102));
        p.setBounds(50,50,400,400);
        p.setBackground(new Color(204,204,255));
        f.add(p);
        f.setVisible(true);
    }
}
