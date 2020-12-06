package com.hcl;

import java.util.Scanner;

public class Product {
	int product_code;
    String product_name;
    double price;
    int Stock;
    int Discount;
    void get_details(){
    Scanner in=new Scanner(System.in);
    System.out.println("Product Code : ");
    product_code=in.nextInt();
    System.out.println("Product name : ");
    product_name=in.nextLine();
    System.out.println("Price : ");
    price=in.nextDouble();
    System.out.println("Stock : ");
    Stock=in.nextInt();
    }
    void checkPrice(Product second){
        if(second.price<this.price){
            System.out.println(second.product_name+" is cheaper than "+this.product_name);
        }else{
            System.out.println(this.product_name+" is cheaper than "+second.product_name);
        }
    }
public static void main(String args[]){
    Product prod1=new Product();
    Product prod2=new Product();
    System.out.println("Product Details : ");
    prod1.get_details();
    prod2.get_details();
    prod1.checkPrice(prod2);
    System.out.println("product details:");
    System.out.println("L&K suppliers:");
    prod1.build_Product();
    prod2.build_Product();
    
}
private void build_Product() {
	// TODO Auto-generated method stub
	System.out.println("product code:"+product_code);
	System.out.println("name:"+product_name);
	System.out.println("stock"+Stock);
	System.out.println("discount:"+Discount);
	
	

}

}
