package com.oops._21032024;

public class Employee {
	private int id;
	private String name;
	private String address;
	
	Employee(int id)
	{
		System.out.println("this is parameterised constructor with id");
		this.id=id;
	}
	
	Employee(String name)
	{
		System.out.println("this is parameterised constructor with name");
		this.name=name;
	}
//	Employee(String address)
//	{
//		System.out.println("this is parameterised constructor with name");
//		this.name=name;
//	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	

}
