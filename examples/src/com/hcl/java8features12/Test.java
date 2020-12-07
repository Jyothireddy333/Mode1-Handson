package com.hcl.java8features12;

public class Test implements Left,Right {

	public void m3() {
		System.out.println("Test Class Method"); 
		Left.super.m1();
		Right.super.m2();
		}
		public static void main(String[] args) {
		Test t = new Test();
		t.m3();
		}

}
