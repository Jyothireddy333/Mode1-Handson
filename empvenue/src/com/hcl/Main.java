package com.hcl;
import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name= scan.next();
		String city= scan.next();
		System.out.println("Venue Details");
		System.out.println("Venue Name :"+name);
		System.out.println("City Name :"+city);
		int x=1;
		while (x>0) {
			System.out.println("Verify and Update Details");
			System.out.println("Menu");
			int n=scan.nextInt();
			if (n==1) {
				String name1= scan.next();
				System.out.println("Venue Details");
				System.out.println("Venue Name :"+name1);
				System.out.println("City Name :"+city);
				
			}
			else if (n==2) {
				String city1= scan.next();
				System.out.println("Venue Details");
				System.out.println("Venue Name :"+name);
				System.out.println("City Name :"+city);
				
				
				
			}
			else {
				System.out.println("Venue Details");
				System.out.println("Venue Name :"+name);
				System.out.println("City Name :"+city);
				
			}
		}
	}

}
