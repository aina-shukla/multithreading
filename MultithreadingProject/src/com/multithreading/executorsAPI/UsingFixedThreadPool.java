package com.multithreading.executorsAPI;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingFixedThreadPool {

	public static void main(String[] args) {

		System.out.println("main starts here..");
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		for(int i=0; i<3;i++) {
			executorService.execute(new UsingFixedThreadPoolClass());
		}
		executorService.shutdown();
		System.out.println("main ends here..");
	}

}
