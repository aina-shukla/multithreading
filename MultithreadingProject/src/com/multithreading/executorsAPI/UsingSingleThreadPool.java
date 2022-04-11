package com.multithreading.executorsAPI;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingSingleThreadPool {

	public static void main(String[] args) {

		System.out.println("main starts here..");
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		for(int i=0; i<3;i++) {
			executorService.execute(new UsingSingleThreadPoolClass());
		}
		executorService.shutdown();
		System.out.println("main ends here..");
	}

}
