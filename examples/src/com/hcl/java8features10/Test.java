package com.hcl.java8features10;

public class Test {
	int x = 10;
	int y = 20;
	public void m2() {
	Interf i = () ->{
	System.out.println(x);
	System.out.println(y);
	x = 888;
	y = 999;
 };
	 i.m1();
	 y = 777;
	}
	public static void main(String[] args) {
	Test t = new Test();
	t.m2();
	}

}
