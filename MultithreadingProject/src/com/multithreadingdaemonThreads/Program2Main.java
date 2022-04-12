package com.multithreadingdaemonThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program2Main {

	// main is a user thread, not daemon thread

	public static void main(String[] args) {
		String threadName = Thread.currentThread().getName();
		System.out.println("start main");
		ExecutorService executorService = Executors.newCachedThreadPool(new NamedDaemonThreadFactory());
		executorService.execute(new TaskClass(100));
		executorService.execute(new TaskClass(200));
		executorService.execute(new TaskClass(100));
		executorService.execute(new TaskClass(200));
		executorService.shutdown();
		System.out.println("end main");
	}

}