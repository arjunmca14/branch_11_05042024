package com.oops.Projects._02042024;

import java.util.Scanner;

public class Person_toy_cloths_AllItemsAvaibale {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter categiry::");
		String categiry=sc.next();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter color");
		String color=sc.next();
		
		AllInOneShop a=new AllInOneShop();
		GeneralItem item= a.getItem(categiry, name, color);
		System.out.println(item);
		
	}
}
