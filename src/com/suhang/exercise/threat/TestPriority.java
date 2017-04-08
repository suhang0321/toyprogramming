package com.suhang.exercise.threat;

/**
 * @author hang.su
 * @since 2017-04-03 9:51
 */
public class TestPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread(new T1());
        Thread t2 = new Thread(new T2());
        t1.setPriority(8);
        t1.start();
        t2.start();
    }

    static class T1 implements Runnable {
        public void run() {
            for (int i = 1; i <= 1000; i++) {
                System.out.println("T1  " + i);
            }
        }
    }

    static class T2 implements Runnable {
        public void run() {
            for (int i = 1; i <= 1000; i++) {
                System.out.println("==============T2  " + i);
            }
        }
    }
}
