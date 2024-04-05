package com.scanner._05032024;

import java.util.Scanner;

public class EmployeeTesterWithScanner {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter id ");
		int id=sc.nextInt();
		
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter address");
		String address=sc.next();
		
		System.out.println("enter salary");
		double salary=sc.nextDouble();
		
		System.out.println("id      :"+id);
		System.out.println("name    :"+name);
		System.out.println("address :"+address);
		System.out.println("salary  :"+salary);
	}

}
