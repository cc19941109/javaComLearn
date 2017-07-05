package com.chen.thread.cooperation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Car {
	private boolean isWaxed = false;

	public synchronized void waxed() {
		isWaxed = true;
		notify();
	}

	public synchronized void buffed() {
		isWaxed = false;
		notify();
	}

	public synchronized void waitForWaxing() throws InterruptedException {
		while (isWaxed == false) {
			wait();
		}
	}

	public synchronized void waitForBuffing() throws InterruptedException {
		while (isWaxed == true) {
			wait();
		}
	}
}

class WaxOn implements Runnable {
	private Car car;

	public WaxOn(Car c) {
		car = c;
	}

	@Override
	public void run() {
		try{
			while (!Thread.interrupted()){
				System.out.println("Wax On");
				TimeUnit.MILLISECONDS.sleep(200);
				car.waxed();
				car.waitForBuffing();
			}
		}catch (InterruptedException e) {
			System.out.println("exiting via interrupt");
		}
		System.out.println("ending wax on task");
	}
	
}

class WaxOff implements Runnable{

	private Car car;
	public WaxOff(Car sCar) {
		car = sCar;
	}
	@Override
	public void run() {
		try {
			while(!Thread.interrupted()){
				car.waitForWaxing();
				System.out.println("wax off");
				TimeUnit.MILLISECONDS.sleep(200);
				car.buffed();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("exiting via interrupt");
		}
		System.out.println("ending wax off task");
	}
	
}

public class TestWax {
	public static void main(String[] args) throws InterruptedException {
		Car car = new Car();
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.execute(new WaxOff(car));
		executorService.execute(new WaxOn(car));
		TimeUnit.SECONDS.sleep(5);
		executorService.shutdown();
		
	}
	
}
