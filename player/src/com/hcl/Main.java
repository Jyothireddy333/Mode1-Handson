package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner p = new Scanner(System.in);
		System.out.println("enter the player name");
		String name = p.nextLine();
		System.out.println("enter the country name");
		String country = p.nextLine();
		System.out.println("enter the skill");
		String skill =p.nextLine();
		System.out.println("enter the player details");
		Player p1 = new Player(name,country,skill);
		System.out.println("player name :"+p1.name+"\n"+"country name :"+p1.country+"\n"+"Skill name :"+p1.Skill);
		

	}

}
