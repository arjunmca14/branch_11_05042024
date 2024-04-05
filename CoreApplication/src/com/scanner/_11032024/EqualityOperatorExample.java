package com.scanner._11032024;

import java.util.Scanner;

public class EqualityOperatorExample {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter education details..");
		String education=sc.next();
		if(education.equals("btech"))
		{
			System.out.println("he is eligible for job");
		}
		else
		{
			System.out.println("he is not eligible for job");
		}
	}

}
