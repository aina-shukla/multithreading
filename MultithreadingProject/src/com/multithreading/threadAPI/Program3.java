package com.multithreading.threadAPI;

import java.util.concurrent.TimeUnit;

public class Program3 {

	public static void main(String[] args) throws InterruptedException {

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("In run.." + Thread.currentThread().getName());
				System.out.println("Priority.." + Thread.currentThread().getPriority());
			}
		});
		thread.setName("New worker thread..");
		thread.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Before start.." + thread.currentThread().getName());
		thread.start();
		System.out.println("After start.." + thread.currentThread().getName());
		thread.sleep(1000);

		new ThirdClass(); // 1st thread
		new ThirdClass(); // 2nd thread
	}

}

class ThirdClass implements Runnable {

	private int count = 0, id;

	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println(id + ":" + i);
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public ThirdClass() {
		this.id = ++count;
		new Thread(this).start();;
	}
}
