package com.chen.thread.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class MySemaphore extends Thread {
	Semaphore position;
	private int id;

	public MySemaphore(int i, Semaphore s) {
		this.id = i;
		this.position = s;
	}

	public void run() {
		try {
			if (position.availablePermits() > 0) {
				System.out.println("顾客[" + this.id + "]进入厕所，有空位");
			} else {
				System.out.println("顾客[" + this.id + "]进入厕所，没空位，排队");
			}
			position.acquire();// 使用资源
			System.out.println("顾客[" + this.id + "]获得坑位");
			Thread.sleep((int) (Math.random() * 1000));
			System.out.println("顾客[" + this.id + "]使用完毕");
			position.release();// 释放资源
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		Semaphore position = new Semaphore(2);
		try {
			ExecutorService exService = Executors.newCachedThreadPool();
			
			for (int i = 0; i < 10; i++) {
				exService.submit(new MySemaphore(i + 1, position));
			}
			exService.shutdown();
			position.acquireUninterruptibly(2);
		} finally {
			position.release(2);
			System.out.println("使用完毕，需要清扫了");
			
		}

	}
}
