package com.chen.thread;

/**
 * Created by Sean on 2017/5/9.
 */
class Threadd extends Thread {

	private Integer ticket = 10;

	@Override
	public void run() {
		while (ticket > 0) {
			synchronized (this) {
				if (ticket > 0) {
					System.out.println(currentThread().getName() + "  票数：" + --ticket);
					// System.out.println(" "+System.currentTimeMillis());
				}
				/*
				 * notifyAll(); try { wait(100); } catch (InterruptedException
				 * e) { e.printStackTrace(); }
				 */
				try {
					yield();
				} catch (Exception e) {
					System.err.println("error");
				}
			}

		}

	}
}

public class TrueRunnableCopy {
	public static void main(String[] args) {
		Threadd thread1 = new Threadd();
		new Thread(thread1).start();
		new Thread(thread1).start();
		new Thread(thread1).start();

		//new Thread(new Threadd()).start();

//		 for (int i = 0; i < 3; i++) {
//		 Thread thread = new Threadd();
//		 thread.start();
//		 }

	}
}