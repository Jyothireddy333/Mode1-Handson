package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the player details");
		String x=s.nextLine();
		String[] xlist=x.split(",");
		String name=xlist[0];
		String country=xlist[1];
		String skill=xlist[2];
		Player t=new Player(name,country,skill);
		System.out.println("player details");
		System.out.println("player name :"+name+"\n"+"country name :"+country+"\n"+"skill :"+skill);
		

	}

}
