package com.suhang.exercise.threat;

import java.util.Date;

/**
 * @author hang.su
 * @since 2017-04-03 8:37
 */
public class TestInterupt {
    public static void main(String[] args) {
        MyThread r = new MyThread();
        r.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
        r.interrupt();
    }

    static class MyThread extends Thread {
        public void run() {
            while (true) {
                System.out.println("====" + new Date() + "====");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
            }

        }
    }
}
