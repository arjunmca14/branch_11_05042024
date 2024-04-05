package com.scanner._11032024;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int n1=sc.nextInt();
		System.out.println("enter second number");
		int n2=sc.nextInt();

		System.out.println("press 1 :addition"); 
		System.out.println("press 2 :subtraction"); 
		System.out.println("press 3 : multiplication"); 
		System.out.println("press 4: division"); 
		System.out.println("press 5: remainder"); 


		System.out.println("enter your choice ");
		int choice=sc.nextInt();


		switch (choice) {
		case 1:	
			System.out.println("addition started");
			int sum=n1+n2;
			System.out.println("sum value>>"+sum);
			break;
		case 2:	
			System.out.println("subtraction started");
			int sub=n1-n2;
			System.out.println("sub value>>>"+sub);
			break;
		case 3:	
			System.out.println("mulitplication started");
			int mul=n1*n2;
			System.out.println("mul value>>>"+mul);
			break;
		case 4:	
			System.out.println("divition started");
			int div=n2/n2;
			System.out.println("div value>>>"+div);
			break;
		case 5:	
			System.out.println("remainder started");
			int rem=n1%n2;
			System.out.println("rem value>>>"+rem);
			break;
		default:System.out.println("boss please enter 1 to 5 only..");
			break;
		}
		



	}
}
