package com.chen.thread.method;

public class ObjectWaitABC implements Runnable {

	private static int flag = 0;
	private String name;
	private Object prev;

	private Object self;

	private ObjectWaitABC(String name, Object prev, Object self) {
		this.name = name;
		this.prev = prev;
		this.self = self;
	}

	@Override
	public void run() {
		int count = 10;
		while (count > 0) {
			synchronized (prev) { // 上一个对象锁，先申请上一个对象的锁，如果上个线程释放对象锁，则获取该对象锁
				synchronized (self) { // 当前对象锁
					System.out.println(name + ((count == 1 && name.equals("C")) ? "" : "->"));
					count--;
					flag++;
					if (count < 9|| flag==3) {
						self.notify();
						// 唤醒下一个等待线程
					}

					System.out.println(Thread.currentThread().getName() + Thread.currentThread().isInterrupted());
				}
				System.out.println("self 资源释放");
				System.out.println("当前线程释放prev资源，使其他线程有能力获得这个prev资源");
				try {
					prev.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // 释放当前线程
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();
		ObjectWaitABC threadA = new ObjectWaitABC("A", c, a);// c是上个对象,a是当前对象
		ObjectWaitABC threadB = new ObjectWaitABC("B", a, b);// a是上个对象,b是当前对象
		ObjectWaitABC threadC = new ObjectWaitABC("C", b, c);// b是上个对象,c是当前对象

		new Thread(threadA).start();

		Thread.sleep(100); // 确保按顺序A、B、C执行
		new Thread(threadB).start();

		Thread.sleep(100); // 确保按顺序A、B、C执行
		Thread threadCc = new Thread(threadC);
		threadCc.setDaemon(true);
		threadCc.start();
		// Thread.sleep(100); //确保按顺序A、B、C执行
		// ReentrantLock
	}
}