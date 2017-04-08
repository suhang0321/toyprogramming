package com.suhang.exercise.GUI;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * @author hang.su
 * @since 2017-04-08 8:37
 */
public class TestMouseAdapter {
    public static void main(String[] args) {
        new MouseFrame("Mouseframe");
    }
}

class MouseFrame extends Frame {
    ArrayList points = null;

    MouseFrame(String s) {
        super(s);
        points = new ArrayList();
        setLayout(null);
        setBounds(300, 300, 500, 600);
        setBackground(Color.yellow);
        setVisible(true);
        addMouseListener(new Monitor3());
    }

    public void paint(Graphics g) {
        Iterator i = points.iterator();
        while (i.hasNext()) {
            Point p = (Point) i.next();
            g.setColor(Color.blue);
            g.fillOval(p.x, p.y, 10, 10);
        }
    }


    public void addPoints(Point p) {
        points.add(p);
    }
}

class Monitor3 extends MouseAdapter {
    public void mousePressed(MouseEvent e) {
        MouseFrame f = (MouseFrame) e.getSource();
        f.addPoints(new Point(e.getX(), e.getY()));
        f.repaint();
    }
}
