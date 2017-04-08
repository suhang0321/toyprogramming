package com.suhang.exercise.GUI;

import java.awt.*;

/**
 * @author hang.su
 * @since 2017-04-06 21:02
 */
public class TestBorderLayout {
    public static void main(String[] args) {
        Frame f = new Frame("BorderLayout Frame");
        Button bn = new Button("BN");
        Button bs = new Button("BS");
        Button bw = new Button("BW");
        Button bc = new Button("BC");
        Button be = new Button("BE");
        f.add(bn, BorderLayout.NORTH);
        f.add(bs, BorderLayout.SOUTH);
        f.add(bw, BorderLayout.WEST);
        f.add(bc, BorderLayout.CENTER);
        f.add(be, BorderLayout.EAST);
        f.setSize(200, 200);
        f.setVisible(true);
    }
}
