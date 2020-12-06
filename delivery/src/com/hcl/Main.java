package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d= new Scanner(System.in);
		System.out.println("enter the over");
		long over=d.nextLong();
		System.out.println("enter the ball");
		long ball=d.nextLong();
		System.out.println("enter the runs");
		long runs=d.nextLong();
		System.out.println("enter batsman name");
		String batsman=d.next();
		System.out.println("enter bowler name");
		String bowler=d.next();
		System.out.println("enter nonstriker name");
		String nonstriker=d.next();
		System.out.println("delivery details");
		System.out.println("over :"+over);
		System.out.println("ball :"+ball);
		System.out.println("runs :"+runs);
		System.out.println("batsman :"+batsman);
		System.out.println("bowler :"+bowler);
		System.out.println("non stiker :"+nonstriker);
		
		
		
		
		

	}

}
