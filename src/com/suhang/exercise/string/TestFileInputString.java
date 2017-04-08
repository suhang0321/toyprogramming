package com.suhang.exercise.string;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author hang.su
 * @since 2017-04-01 14:37
 */
public class TestFileInputString {
    public static void main(String[] args) {
        int b = 0;
        FileInputStream in = null;
        try {
            in = new FileInputStream("C:\\Users\\zhanghang\\git\\toyprograming\\src\\com\\suhang\\exercise\\string\\TestFileInputString.java");
        } catch (FileNotFoundException e) {
            System.out.println("file is not exist");
            System.exit(-1);
        }
        try {
            int num = 0;
            while ((b = in.read()) != -1) {
                System.out.print((char) b);
                num++;
            }
            in.close();
            System.out.println();
            System.out.println("readed  " + num + " bytes");
        } catch (IOException ex) {
            System.out.println("error in file reading");
            System.exit(-1);
        }
    }
}
