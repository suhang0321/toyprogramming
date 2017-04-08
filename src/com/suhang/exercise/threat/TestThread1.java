package com.suhang.exercise.threat;

/**
 * @author hang.su
 * @since 2017-04-02 21:29
 */
public class TestThread1 {
    public static void main(String[] args) {
        Runner1 r = new Runner1();
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main thread     " + i);
        }
    }

    private static class Runner1 implements Runnable {
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("Runner1    " + i);
            }
        }
    }
}


