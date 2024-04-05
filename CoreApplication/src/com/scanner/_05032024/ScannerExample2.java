package com.scanner._05032024;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		boolean flag=true;
		
		while(flag)
		{
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("my name is >>"+name);
		
		System.out.println("enter name");
		String name1=sc.next();
		System.out.println("my name is >>"+name1);
		
		
		System.out.println("enter name");
		String name2=sc.next();
		System.out.println("my name is >>"+name2);
		
		
		System.out.println("boss if you want to continue or not(true/false)");
		flag=sc.nextBoolean();
		}
		
	}

}
