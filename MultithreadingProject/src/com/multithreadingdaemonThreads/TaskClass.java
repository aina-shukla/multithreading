package com.multithreadingdaemonThreads;

import java.util.concurrent.TimeUnit;

public class TaskClass implements Runnable {

	private static int count = 0;
	private int id;
	private long sleepTime;

	@Override
	public void run() {
		boolean isDaemon = Thread.currentThread().isDaemon();
		String threadType = isDaemon ? "DAEMON" : "USER ";
		String currthreadName = Thread.currentThread().getName();
		System.out.println("task " + id + " "+threadType + " thread " + currthreadName + " started");
		for (int i = 10; i > 0; i--) {
			System.out.println(id + " thread " + currthreadName + ":" + i);
			try {
				TimeUnit.MILLISECONDS.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("task " + id + " "+threadType + " thread " + currthreadName + " ended");
	}

	public TaskClass(long sleepTime) {
		this.sleepTime = sleepTime;
		this.id = ++count;
	}

}