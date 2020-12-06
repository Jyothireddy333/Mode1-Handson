package com.hcl;
	public class Service implements Car {
		int sum=0,d;
	    String k="Maruti";
	     public void sum(int carnumber){
	        while(carnumber!=0)
	        {
	            d=carnumber%10;
	            sum=sum+d;
	            carnumber=carnumber/10;
	        }
	        if (sum%2!=0)
	        {
	            System.out.println("You can go for servicing on mon,wed,fri");
	        }
	        else
	        {
	            System.out.println("You can go for servicing on tue,thrus,sat");
	        }
	        
	     }
	    public void years(int old)
	    {
	        if(old > 5)
	        {
	            System.out.println("Car washing is free");
	        } 
	        else
	        {
	            System.out.println("Not eligible for car washing");
	        }
	     }
	     
	     public void brand(String brands)
	     {
	        if( brands.equals(k))
	        { 
	         System.out.println("Your servicing charges is 4750");
	        }
	     }
	}
	     