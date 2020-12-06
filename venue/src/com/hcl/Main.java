package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner v=new Scanner(System.in);
		System.out.println("enter the venue name");
		String name =v.nextLine();
		System.out.println("enter the city name");
		String city = v.nextLine();
		System.out.println("enter the venue details");
		Venue v1= new Venue(name,city);
		System.out.println("venue name :"+v1.name+"\n"+"venue city :"+v1.city);
		
		
		
		

	}

}
