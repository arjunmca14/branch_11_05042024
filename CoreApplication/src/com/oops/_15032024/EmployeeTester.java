package com.oops._15032024;

public class EmployeeTester {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(101);
		emp.setName("raju");
		emp.setAddress("hyd");
		emp.setSalary(12000);
		
		System.out.println("id is ::"+emp.getId());
		System.out.println("name is ::"+emp.getName());
		System.out.println("address is ::"+emp.getAddress());
		System.out.println("salary is ::"+emp.getSalary());
//		emp.id=101;
//		emp.name="raju";
//		emp.address="hyd";
//		emp.salary=12000;
//
//		System.out.println("id   :"+emp.id);
//		System.out.println("name  :"+emp.name);
//		System.out.println("address : "+emp.address);
//		System.out.println("salary :"+emp.salary);
	}

}
