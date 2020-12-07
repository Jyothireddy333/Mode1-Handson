package com.hcl.java8features15;
import java.util.function.*;

public class Test {
	public static void main(String[] args) {
		Function<String, Integer> f = s ->s.length();
		System.out.println(f.apply("Durga"));
		System.out.println(f.apply("Soft"));
		}

}
