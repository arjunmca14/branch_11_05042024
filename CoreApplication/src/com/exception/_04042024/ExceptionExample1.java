package com.exception._04042024;

import java.util.Scanner;

public class ExceptionExample1 {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age..");
		int age=sc.nextInt();
		if(age <100 && age>30)
		{
			System.out.println("he is eligible");
		}
		else if(age>0 && age<30)
		{
			System.out.println("he is not elgible");
		}
		else
		{
//			System.out.println("please give proper age value..");
			throw new AgeEligibleCheck("please give proper age value..");
		}
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("my name is "+name+" and age is ::"+age);
		
			
	}
}
