package com.suhang.exercise.string;

import java.io.*;

/**
 * @author hang.su
 * @since 2017-04-01 15:39
 */
public class TestFileWriter {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("D:\\bak\\unicode.dat");
            for (int c = 0; c < 5000; c++) {
                fw.write(c);
            }
        }catch(IOException e){
            System.out.println("文件写入错误");
            System.exit(-1);
        }
    }
}
