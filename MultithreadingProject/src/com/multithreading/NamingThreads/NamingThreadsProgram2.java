package com.multithreading.NamingThreads;

import java.util.concurrent.TimeUnit;

public class NamingThreadsProgram2 implements Runnable {

	private static int count = 0;
	private int id;

	@Override
	public void run() {
		String currthreadName = Thread.currentThread().getName();
		System.out.println("task " + id + " thread " + currthreadName + " started");
		for (int i = 10; i > 0; i--) {
			System.out.println(id + " thread " + currthreadName + ":" + i);
			try {
				TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("task " + id + " thread " + currthreadName + " ended");
	}

	public NamingThreadsProgram2() {
		this.id = ++count;
	}

}
