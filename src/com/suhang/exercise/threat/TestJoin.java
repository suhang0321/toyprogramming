package com.suhang.exercise.threat;

/**
 * @author hang.su
 * @since 2017-04-03 9:08
 */
public class TestJoin {
    public static void main(String[] args) {
        MyThread2 m = new MyThread2("abc");
        m.start();

        try {
            m.join();
        } catch (InterruptedException e) {
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("i am main Thread!");
        }
    }

    static class MyThread2 extends Thread {
        MyThread2(String s) {
            super(s);
        }

        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("i am  " + getName());
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return ;
            }
        }
    }
}
