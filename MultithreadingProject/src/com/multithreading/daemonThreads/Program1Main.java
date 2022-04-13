package com.multithreading.daemonThreads;

import com.multithreading.NamingThreads.NamingThreadsProgram1;

public class Program1Main {

	// main is a user thread, not daemon thread

	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.println("start main");

		TaskClass task1 = new TaskClass(887878);
		Thread t1 = new Thread(task1, "thread-1");

		TaskClass task2 = new TaskClass(8878);
		Thread t2 = new Thread(task2, "thread-2");
		t2.setDaemon(true);
		t1.start();
		t2.start();

		System.out.println("end main");
	}

}