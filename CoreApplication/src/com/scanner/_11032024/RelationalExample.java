package com.scanner._11032024;

import java.util.Scanner;

public class RelationalExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age value");
		int age=sc.nextInt();
		
		if(age >=50)
		{
			System.out.println("he is eligible for pinction");
		}
		else
		{
			System.out.println("he is not eligible for pinction");
		}
		
	}

}
