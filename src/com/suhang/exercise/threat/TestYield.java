package com.suhang.exercise.threat;

/**
 * @author hang.su
 * @since 2017-04-03 9:42
 */
public class TestYield {
    public static void main(String[] args) {
        Mythread m1 = new Mythread("m1");
        Mythread m2 = new Mythread("m2");
        m1.start();
        m2.start();
    }

    static class Mythread extends Thread {
        Mythread(String s) {
            super(s);
        }

        public void run() {
            for (int i = 1; i <= 100; i++) {
                System.out.println(getName() + "  "+ i);
                if (i % 10 == 0) {
                    yield();
                }
            }
        }
    }
}
