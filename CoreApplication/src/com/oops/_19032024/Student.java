package com.oops._19032024;

public class Student extends Address{
	
	
//	Student()
//	{
//		System.out.println("student default constructor...");
//	}

	private int id;
	private String name;
//	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", getPincode()=" + getPincode() + ", getCity()=" + getCity()
				+ ", getState()=" + getState() + "]";
	}

	
	
	
}
