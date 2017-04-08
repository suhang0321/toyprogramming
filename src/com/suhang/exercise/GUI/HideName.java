package com.suhang.exercise.GUI;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author hang.su
 * @since 2017-04-08 9:28
 */
public class HideName {
    public static void main(String[] args) {
        new YourFrame("windowEvent");
    }
}

class YourFrame extends Frame {
    YourFrame(String s) {
        super(s);
        setLayout(null);
        setBounds(300, 300, 500, 600);
        setBackground(Color.blue);
        setVisible(true);
        //匿名类使用：
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                setVisible(false);
                System.exit(-1);
            }
        });
    }


}
