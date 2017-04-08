package com.suhang.exercise.threat;

import static java.lang.Thread.sleep;

/**
 * @author hang.su
 * @since 2017-04-03 14:07
 */
public class TestSync implements Runnable {
    Timer timer = new Timer();

    public static void main(String[] args) {
        TestSync ts = new TestSync();
        Thread t1 = new Thread(ts);
        Thread t2 = new Thread(ts);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }

    public void run() {
        timer.add(Thread.currentThread().getName());
    }


    class Timer {
        private  int num = 0;

        private  void add(String name) {
            synchronized (this) {
                num++;
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                }
                System.out.println(name + "你是第" + num + "个使用Timer的线程");
            }
        }
    }
}

