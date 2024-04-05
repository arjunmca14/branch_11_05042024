package com.oops.Projects._01042024.cloths;

import java.util.Scanner;

public class Customer {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		
		
		System.out.println("enter Cloths name");
		String name=sc.next();
		System.out.println("enter which type of color");
		String color=sc.next();
		
		ClothShop shop=new ClothShop();
		Cloths c=shop.getcloths(name, color);
		System.out.println(c);
		
		

	}

}
