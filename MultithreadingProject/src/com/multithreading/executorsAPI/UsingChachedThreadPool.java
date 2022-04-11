package com.multithreading.executorsAPI;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingChachedThreadPool {

	public static void main(String[] args) {

		System.out.println("main starts here..");
		ExecutorService executorService = Executors.newCachedThreadPool();
		for(int i=0; i<3;i++) {
			executorService.execute(new UsingCachedThreadPoolClass());
		}
		executorService.shutdown();
		System.out.println("main ends here..");
	}

}
