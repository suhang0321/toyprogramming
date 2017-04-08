package com.suhang.exercise.string;

import java.io.*;

/**
 * @author hang.su
 * @since 2017-04-01 18:45
 */
public class TestBufferStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\java\\universalclass\\TestFile.java");
            BufferedInputStream bis = new BufferedInputStream(fis);
            System.out.println(bis.read());
            System.out.println(bis.read());
        }catch(IOException e){
            System.out.println("error in reading");
        }
    }
}
