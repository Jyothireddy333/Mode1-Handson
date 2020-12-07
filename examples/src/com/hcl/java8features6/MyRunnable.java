package com.hcl.java8features6;

public class MyRunnable implements Runnable{
	public void run() {
		for(int i=0; i<10; i++) {
	 System.out.println("Child Thread");
		 }
	}
}
