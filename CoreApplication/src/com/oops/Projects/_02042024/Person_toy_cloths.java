package com.oops.Projects._02042024;

import java.util.Scanner;

import com.oops.Projects._01042024.cloths.ClothShop;
import com.oops.Projects._01042024.cloths.Cloths;
import com.oops.Projects._01042024.toyes.ToyiesShop;
import com.oops.Projects._01042024.toyes.Toys;

public class Person_toy_cloths {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter toy name");
		String toyname=sc.next();
		System.out.println("enter toy color");
		String toycolor=sc.next();
		ToyiesShop t=new ToyiesShop();
		Toys toys=t.getToy(toyname, toycolor);
		System.out.println(toys);
		System.out.println("====================");
		
		
		
		System.out.println("enter cloth name");
		String clothname=sc.next();
		System.out.println("enter cloth color");
		String clothcolor=sc.next();
		ClothShop c=new ClothShop();
		Cloths cloths=c.getcloths(clothname, clothcolor);
		System.out.println(cloths);
	
		
		
	}
}
