package com.suhang.exercise.GUI;

import java.awt.*;

/**
 * @author hang.su
 * @since 2017-04-06 16:48
 */
public class TestFlowLayout {
    public static void main(String[] args) {
        Frame f = new Frame("flowlayout frame");
        Button b1 = new Button("ok");
        Button b2 = new Button("open");
        Button b3 = new Button("close");
        f.setBackground(Color.yellow);
        f.setLayout(new FlowLayout());
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setSize(500,500);
        f.setVisible(true);
    }
}
