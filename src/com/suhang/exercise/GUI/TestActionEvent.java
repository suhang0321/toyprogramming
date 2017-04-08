package com.suhang.exercise.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author hang.su
 * @since 2017-04-07 9:02
 */
public class TestActionEvent {
    public static void main(String[] args) {
        Frame f = new Frame("ActionEvent Frame");
        Button b = new Button("press me");
        Monitor m = new Monitor();
        b.addActionListener(m);
        f.add(b, BorderLayout.CENTER);
        f.pack();
        f.setVisible(true);
    }
}

class Monitor implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("a button has been pressed!");
    }
}
