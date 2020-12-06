package com.hcl;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Area Calculator");
		  System.out.println("Select your choice");
		  System.out.println("1.Square");
		  System.out.println("2.Rectangle");
		  System.out.println("3.Triangle");
		  System.out.println("4.circle");
		       select=sc.nextInt();
		       Main choice=new Main();
		       
		       switch(select)
		       {
		       case 1:
		         choice.square();
		         break;
		       case 2:
		        choice.Rectangle();
		        break;
		       case 3:
		        choice.Triangle();
		        break;
		       case 4:
		        choice.circle();
		        break;
		     default:
		      System.out.println("Enter a valid command"); 

	}

}

	private void square() {
		// TODO Auto-generated method stub
		int area,s;
		System.out.println("Enter the length of side");
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		area=s*s;
		System.out.println("area of square ="+area);
		
	}

	private void Rectangle() {
		// TODO Auto-generated method stub
		int area,l,b;
		 System.out.println("Enter the length of side");
		 System.out.println("Enter the breadth of side");
		 Scanner sc=new Scanner(System.in);
		 l=sc.nextInt();
		 b=sc.nextInt();
		 area=l*b;
		 System.out.println("area of square ="+area); 
		
	}

	private void Triangle() {
		// TODO Auto-generated method stub
		int area,h,b;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the length of base");
		 b=sc.nextInt();
		 System.out.println("Enter the length of height");
		 h=sc.nextInt();
		 area=(h*b)/2;
		 System.out.println("area of Triangle ="+area); 
		
	}

	private void circle() {
		// TODO Auto-generated method stub
		int area,r;
		 System.out.println("Enter the length of side");
		 Scanner sc=new Scanner(System.in);
		 r=sc.nextInt();
		 area=22/7*r*r;
		 System.out.println("area of circle ="+area);  
		
	}
}
