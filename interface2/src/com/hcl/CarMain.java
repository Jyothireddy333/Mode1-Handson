package com.hcl;
	import java.util.*;
	public class CarMain {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int carnumber,old;
	        String brands;
	        Scanner o = new Scanner(System.in);
	        carnumber=o.nextInt();
	        old=o.nextInt();
	        brands=o.next();
	        Service obj=new Service();
	        obj.sum(carnumber);
	        obj.years(old);
	        obj.brand(brands);
		}
	}



