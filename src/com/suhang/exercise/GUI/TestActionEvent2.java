package com.suhang.exercise.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author hang.su
 * @since 2017-04-07 9:18
 */
public class TestActionEvent2 {
    public static void main(String[] args) {
        Frame f = new Frame("Test");
        Button b1 = new Button("start");
        Button b2 = new Button("stop");
        Monitor2 m = new Monitor2();
        b1.addActionListener(m);
        b2.addActionListener(m);
        b1.setActionCommand("mission 1 start");
        b2.setActionCommand("final mission,game over");
        f.add(b1, BorderLayout.WEST);
        f.add(b2, BorderLayout.EAST);
        f.pack();
        f.setVisible(true);
    }
}

class Monitor2 implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("a button has been pressed  " + "the relative info is: ");
        System.out.println(e.getActionCommand());
    }
}
