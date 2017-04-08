package com.suhang.exercise.GUI;

import java.awt.*;
import java.awt.event.*;

/**
 * @author hang.su
 * @since 2017-04-07 14:13
 */
public class TFMath {
    public static void main(String[] args) {
        new MyFrame1();
    }
}

class MyFrame1 extends Frame {
    TextField num1, num2, num3;

    MyFrame1() {
        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(15);
        Label plus = new Label("+");
        Button equals = new Button("=");
        equals.addActionListener(new Mymonitor(this));
        setLocation(300, 300);
        setLayout(new FlowLayout());
        add(num1);
        add(plus);
        add(num2);
        add(equals);
        add(num3);
        pack();
        setVisible(true);
    }
}

class Mymonitor implements ActionListener {

    /* TextField num1,num2,num3;
     public Mymonitor(TextField num1,TextField num2,TextField num3){
         this.num1 = num1;
         this.num2 = num2;
         this.num3 = num3;
     }
     */
    MyFrame1 mf = null;

    Mymonitor(MyFrame1 mf) {
        this.mf = mf;
    }

    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(mf.num1.getText());
        int n2 = Integer.parseInt(mf.num2.getText());
        mf.num3.setText(String.valueOf(n1 + n2));
    }

}
