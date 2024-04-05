package com.operators._13032024;

import java.util.Scanner;

public class ShiftoperatorExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age::");
		int age=sc.nextInt();
		System.out.println("enter education..");
		String education=sc.next();
		
		if((education=="btech")  &&   (age >=30))
		{
			System.out.println("he is eligible...");
		}
		else
		{
			System.out.println("he is not eligible...");
		}
//		if(education.equals("btech"))
//		{
//			if(age >30)
//			{
//				System.out.println("he is eligible");
//			}
//			else
//			{
//				System.out.println("he is not eligible...");
//			}
//		}
//		else
//		{
//			System.out.println("he is not eligible");
//		}
	}

}
