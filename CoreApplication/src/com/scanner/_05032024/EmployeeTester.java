package com.scanner._05032024;

public class EmployeeTester {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.id=101;
		emp.name="raju";
		emp.address="hyderabad";
		emp.salary=23000;
		
		
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.address);
		System.out.println(emp.salary);
		
		
		
		emp.id=345;
		emp.name="rakesh";
		emp.address="hyderabad";
		emp.salary=26000;
		
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.address);
		System.out.println(emp.salary);
		
	}

}
