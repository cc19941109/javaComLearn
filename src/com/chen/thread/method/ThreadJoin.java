package com.chen.thread.method;

class Athread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName() + "运行开始!");
        for (int i = 0; i < 5; i++) {
            System.out.println(currentThread().getName() + "======>" + i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "运行结束!");
    }
}

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "线程运行开始!");
        Athread thread1 = new Athread();
        Athread thread2 = new Athread();
        thread1.setName("线程A");
        thread2.setName("线程B");
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("这时thread1 和 thread2 都执行完毕之后才能执行主线程打印此句话因为两个子线程都被主线程调用了join() 方法");
        System.out.println(Thread.currentThread().getName() + "线程运行结束!");
    }
}