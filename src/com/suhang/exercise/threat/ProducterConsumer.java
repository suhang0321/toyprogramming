package com.suhang.exercise.threat;

/**
 * @author hang.su
 * @since 2017-04-04 9:43
 */
public class ProducterConsumer {
    public static void main(String[] args) {
        BasketStack bs = new BasketStack();
        Producter p = new Producter(bs);
        Consumer c = new Consumer(bs);
        new Thread(p).start();
        new Thread(p).start();
        new Thread(p).start();
        new Thread(c).start();
    }
}


    class WoTou {
        int id;

        WoTou(int id) {
            this.id = id;
        }

        public String toString() {
            return "  WoTou  " + id;
        }
    }


    class BasketStack {
        int index = 0;
        WoTou[] arrWT = new WoTou[6];

        public synchronized void push(WoTou wt) {
            while (index == arrWT.length) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.notifyAll();
            arrWT[index] = wt;
            index++;
        }

        public synchronized WoTou pop() {
            while (index == 0) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            index--;
            return arrWT[index];
        }
    }


    class Producter implements Runnable {
        BasketStack bs = null;

        Producter(BasketStack bs) {
            this.bs = bs;
        }

        public void run() {
            for (int i = 1; i < 20; i++) {
                WoTou wt = new WoTou(i);
                bs.push(wt);
                System.out.println("生产了" + wt);
            }
        }
    }

    class Consumer implements Runnable {
        BasketStack bs = null;

        Consumer(BasketStack bs) {
            this.bs = bs;
        }

        public void run() {
            for (int i = 1; i < 20; i++) {
                WoTou wt = bs.pop();
                System.out.println("消费了" + wt);
            }
        }
    }

