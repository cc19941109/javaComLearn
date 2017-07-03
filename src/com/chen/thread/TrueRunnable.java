package com.chen.thread;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

/**
 * Created by Sean on 2017/5/9.
 */
class Thread4 implements Runnable {

    private int ticket = 10;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(currentThread().getName() + "运行，此时的 i = " + i + " 剩余票数" + this.ticket--);
                }
            }
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TrueRunnable {
    public static void main(String[] args) {
        Thread4 thread1 = new Thread4();
        new Thread(thread1).start();
        new Thread(thread1).start();
        new Thread(thread1).start();
        
        new Thread(new Thread4()).start();
        
    }
}