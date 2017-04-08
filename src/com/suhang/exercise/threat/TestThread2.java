package com.suhang.exercise.threat;

/**
 * @author hang.su
 * @since 2017-04-03 10:05
 */
public class TestThread2 {
    public static void main(String[] args) {
        Thread r1 = new Thread(new Runner2());
        Thread r2 = new Thread(new Runner2());
        r1.start();
        r2.start();
    }

    static class Runner2 implements Runnable {
        public void run() {
            for (int i = 1; i < 31; i++) {
                System.out.println("No.   " + i);
            }
        }
    }
}
