package com.scanner._11032024;

import java.util.Scanner;

public class StudentExample1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter telugu marks ");
		int telugu=sc.nextInt();
		
		System.out.println("enter Hindi marks ");
		int hindi=sc.nextInt();
		
		System.out.println("enter English marks ");
		int english=sc.nextInt();
		
		System.out.println("enter Maths marks ");
		int maths=sc.nextInt();
		
		System.out.println("enter Science marks ");
		int science=sc.nextInt();
		
		System.out.println("enter Scocial marks ");
		int scocial=sc.nextInt();
		
		int total=telugu+hindi+english+maths+science+scocial;
		
		System.out.println("toatl marks >>>"+total);
		
		int average=(total)/(6);
		System.out.println("average>>>"+average);
		
	}

}
