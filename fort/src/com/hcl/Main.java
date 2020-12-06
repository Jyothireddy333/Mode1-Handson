package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner s = new Scanner(System.in);
		fort f=null;
		System.out.println("what you want to visit \r\n"+"\r\n"+"rajamachi\r\n"+"\r\n"+"shivgadh\r\n"+"\r\n"+"murud");
		ch=s.nextInt();
		switch(ch)
		{
		case 1:
			f=new Rajamachi();
			f.distance();
			break;
		case 2:
			f=new Shivagadh();
			f.distance();
			break;
		case 3:
			f=new Murud();
			f.distance();
			break;
		}

	}

}
