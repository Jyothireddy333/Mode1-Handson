package com.hcl.java8features9;

public class Test {

	int x = 777;
	public void m2() {
	Interf i = ()->{
	int x = 888;
	System.out.println(x);
	System.out.println(this.x);
	 };
	 i.m1();
	 }
	public static void main(String[] args) {
		Test t = new Test();
		t.m2();
		}
}
