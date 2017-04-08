package com.suhang.exercise.GUI;

import java.awt.*;

/**
 * @author hang.su
 * @since 2017-04-07 16:07
 */
public class TestPaint {
    public static void main(String[] args) {
        new PaintFrame().createFrame();
    }
}

class PaintFrame extends Frame {
    public void createFrame() {
        setBounds(300, 300, 600, 700);
        setVisible(true);
    }

    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 70, 70);
        g.setColor(Color.blue);
        g.fillRect(200, 200, 60, 60);
        g.setColor(c);
    }
}
