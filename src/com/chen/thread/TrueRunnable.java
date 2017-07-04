package com.chen.thread;

/**
 * Created by Sean on 2017/5/9.
 */
class Thread4 extends Thread {

	private int ticket = 10;

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			synchronized (this) {
				if (ticket > 0) {
					System.out.println(currentThread().getName() + "运行，此时的 i = " + i + " 剩余票数" + --this.ticket);
				}
//				notifyAll();
//				try {
//					wait(5);//放弃锁
//					//sleep(5);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
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

		// new Thread(new Thread4()).start();

		// for (int i = 0; i < 3; i++) {
		// Thread thread = new Thread4();
		// thread.start();
		// }

	}
}