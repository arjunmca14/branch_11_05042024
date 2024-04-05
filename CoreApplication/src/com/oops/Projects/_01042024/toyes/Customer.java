package com.oops.Projects._01042024.toyes;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		
		
		System.out.println("enter toy name");
		String toyname=sc.next();
		System.out.println("enter which type of color");
		String color=sc.next();
	
//		System.out.println("if you want any more?");
//		flag=sc.nextBoolean();
		
		
		
		ToyiesShop shop=new ToyiesShop();
		Toys t=shop.getToy(toyname, color);
		System.out.println(t);
		
		
		
	}

}
