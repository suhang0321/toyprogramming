package com.suhang.exercise.GUI;

import java.awt.*;

import javafx.scene.layout.Pane;

/**
 * @author hang.su
 * @since 2017-04-06 16:09
 */
public class TestCenterPanel {
    public static void main(String[] args)throws NullPointerException {
        new MyFrame2(300, 300, 800, 800, Color.blue);
    }
}

class MyFrame2 extends Frame {
    private Panel p;

    MyFrame2(int x, int y, int w, int h, Color c) {
        super("center panel");
        setLayout(null);
        setBounds(x, y, w, h);
        setBackground(c);
        p = new Panel(null);
        p.setBackground(Color.yellow);
        p.setBounds(w/ 4, h / 4, w / 2, h / 2);
        add(p);
        setVisible(true);
    }
}
