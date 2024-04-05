package com.scanner._05032024;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("boss please enter age value ");
		int age=sc.nextInt();
//		
		if(age > 35) {
			System.out.println("he is eligible for job");  //true condition
		}
		else
		{
			System.out.println("he is not eligible"); //false condition
		}
	}

}
