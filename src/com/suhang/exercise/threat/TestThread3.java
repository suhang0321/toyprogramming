package com.suhang.exercise.threat;

/**
 * @author hang.su
 * @since 2017-04-03 10:12
 */
public class TestThread3 {
    public static void main(String[] args) {
        Runner3 m = new Runner3();
        Thread t1 = new Thread(m);
        t1.start();
        for (int i = 0; i <= 1000; i++) {
            if (i % 100 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("main thread is over");
        m.shutdown();
    }

    static class Runner3 implements Runnable {
        boolean flag = true;

        public void run() {
            int i = 0;
            while (flag) {
                System.out.println("i am No.  " + i++);
            }
        }

        public void shutdown() {
            flag = false;
        }
    }
}
