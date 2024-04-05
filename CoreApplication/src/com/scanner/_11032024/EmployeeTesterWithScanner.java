package com.scanner._11032024;

import java.util.Scanner;

public class EmployeeTesterWithScanner {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter id ");
		int input_id=sc.nextInt();
		
		System.out.println("enter name");
		String input_name=sc.next();
		
		System.out.println("enter address");
		String input_address=sc.next();
		
		System.out.println("enter salary");
		double input_salary=sc.nextDouble();

		
		
		//Converting into Employee Object
		Employee emp=new Employee();
		emp.id=input_id;
		emp.name=input_name;
		emp.address=input_address;
		emp.salary=input_salary;
		
		
		
		//Object data display into Console..
		
		System.out.println("id      :"+emp.id);
		System.out.println("name    :"+emp.name);
		System.out.println("address :"+emp.address);
		System.out.println("salary  :"+emp.salary);
	}

}
