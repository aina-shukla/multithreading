package com.multithreading.daemonThreads;

import java.util.concurrent.ThreadFactory;

public class NamedThreadFactory implements ThreadFactory {

	private static int count=0;
	private static String threadName= "Poolworker-";
	
	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r, threadName + ++count);
		return t;
	}

}
