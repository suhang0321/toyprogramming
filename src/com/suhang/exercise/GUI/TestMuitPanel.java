package com.suhang.exercise.GUI;

import java.awt.*;

/**
 * @author hang.su
 * @since 2017-04-06 14:26
 */
public class TestMuitPanel {
    public static void main(String[] args){
        new MyFrame("JAVA Frame With Panel",300,300,400,400);
    }
}
class MyFrame extends Frame{
    private Panel p1,p2,p3,p4;
    MyFrame(String s, int x,int y,int w,int h){
        super(s);
        p1 = new Panel(null);p2 = new Panel(null);
        p3 = new Panel(null);p4 = new Panel(null);
        p1.setBounds(0,0,w/2,h/2);
        p2.setBounds(0,h/2,w/2,h/2);
        p3.setBounds(w/2,0,w/2,h/2);
        p4.setBounds(w/2,h/2,w/2,h/2);
        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.GREEN);
        p3.setBackground(Color.YELLOW);
        p4.setBackground(Color.BLUE);
        add(p1);add(p2);add(p3);add(p4);
        setBounds(x,y,w,h);
        setVisible(true);
    }
}
