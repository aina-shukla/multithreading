package com.multithreading.NamingThreads;

public class NamingThreadsMainProgram1 {

	public static void main(String[] args) {

		System.out.println("start main");
		String currthreadName = Thread.currentThread().getName();
		new Thread(new NamingThreadsProgram1()).start(); // 1st thread
		Thread t = new Thread(new NamingThreadsProgram1()); // 2nd thread
		t.start();
		System.out.println("end main");
	}

}
