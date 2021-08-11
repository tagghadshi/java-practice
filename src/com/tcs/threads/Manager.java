package com.tcs.threads;

public class Manager {
	public static void main(String[] args) {
		
		for(int i =0 ; i<10 ;i++) {
			Worker worker1 = new Worker();
			Thread t1 = new Thread(worker1);
//			t1.setPriority(2);// values can be 1 to 10 set the priority of thread
			t1.start();
			System.out.println(Thread.currentThread().toString()+i);
		}
	}
}
