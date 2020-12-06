package com.hcl;

import java.util.Scanner;

public class TestBank {
public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("enter your choice");
		Scanner s=new Scanner(System.in);
		int ch;
		ch=s.nextInt();
		switch(ch)
		{
			case 1:
				AxisBank a=new AxisBank();
				a.duration();
				a.amount();
				break;
			case 2:
				HdfcBank h=new HdfcBank();
				h.duration();
				h.amount();
				break;
			case 3:
				IciciBank i=new IciciBank();
				i.duration();
				i.amount();
				break;
		}
	}
}
