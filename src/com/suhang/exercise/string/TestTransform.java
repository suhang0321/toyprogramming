package com.suhang.exercise.string;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * @author hang.su
 * @since 2017-04-02 8:57
 */
public class TestTransform {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\bak\\exercise.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            osw.write("microsoftsunjava");
            osw.close();

            osw = new OutputStreamWriter(new FileOutputStream("D:\\bak\\exercise.txt", true), "ISO8859_1");
            osw.write("microsoftsunjava");
            System.out.println(osw.getEncoding());
            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
