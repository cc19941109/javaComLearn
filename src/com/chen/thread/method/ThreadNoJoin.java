package com.chen.thread.method;

class Thread6 extends Thread {

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

public class ThreadNoJoin {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "线程运行开始!");
        Thread6 thread1 = new Thread6();
        Thread6 thread2 = new Thread6();
        thread1.setName("线程A");
        thread2.setName("线程B");
        thread1.start();
        thread2.start();
        System.out.println("这时thread1 和 thread2 都执行完毕之后才能执行主线程打印此句话因为两个子线程都被主线程调用了join() 方法");
        System.out.println(Thread.currentThread().getName() + "线程运行结束!");
    }
}