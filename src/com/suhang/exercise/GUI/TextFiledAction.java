package com.suhang.exercise.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author hang.su
 * @since 2017-04-07 9:51
 */
public class TextFiledAction {
    public static void main(String[] args) {
        new TFFrame();
    }
}

class TFFrame extends Frame {
    TFFrame() {
        TextField tf = new TextField();
        add(tf);
        tf.addActionListener(new TFActionListener1());
        tf.setEchoChar('*');
        setLocation(300,300);
        pack();
        setVisible(true);
    }
}

class TFActionListener1 implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        TextField tf = (TextField) e.getSource();
        System.out.println(tf.getText());
        tf.setText(" ");
    }
}
