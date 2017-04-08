package com.suhang.exercise.string;

import java.io.*;

/**
 * @author hang.su
 * @since 2017-04-01 15:26
 */
public class TestFileRead {
    public static void main(String[] args) {
        FileReader fr = null;
        int c = 0;
        try

        {
            fr = new FileReader("D:\\java\\Array\\Test.java");
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (
            FileNotFoundException e)

        {
            System.out.println("文件不存在");
        } catch (
            IOException e)

        {
            System.out.println("文件存储错误");
        }
    }
}
