package com.hcl.java8features6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<10; i++) {
				System.out.println("Main Thread");
	 	}
	}

}
