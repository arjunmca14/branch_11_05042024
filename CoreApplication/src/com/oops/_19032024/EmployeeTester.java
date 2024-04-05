package com.oops._19032024;

public class EmployeeTester {
	public static void main(String[] args) {
		
//		Address add=new Address();
//		add.setCity("Hyd");
//		add.setState("TS");
//		add.setPincode(500018);
		
		
		Employee emp=new Employee();
		emp.setId(101);
		emp.setName("raju");
//		emp.setAddress("hyd");
//		emp.setAddress(add);
		emp.setSalary(25000);
		System.out.println(emp);
	}

}
