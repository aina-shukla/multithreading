package com.multithreading.threadAPI;

import java.util.concurrent.TimeUnit;

public class Program5 {

	public static void main(String[] args) {
		
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 10; i > 0; i--) {
					System.out.println(i);
					try {
						TimeUnit.MILLISECONDS.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t.start();
	
	}

}
