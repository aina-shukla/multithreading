package com.multithreading.executorsAPI;

import java.util.concurrent.TimeUnit;

public class UsingSingleThreadPoolClass implements Runnable {

	private static int count = 0;
	private int id;

	@Override
	public void run() {
		System.out.println("task "+id+" started");
		for (int i = 10; i > 0; i--) {
			System.out.println(id + ":" + i);
			try {
				TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("task "+id+" ended");
	}

	public UsingSingleThreadPoolClass() {
		this.id = ++count;
	}

}
