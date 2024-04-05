package com.oops.Projects._01042024.toyes;

public class ToyManufacturePlace {
	
	public Toys getToyManufacture(String name,String color)
	{
		Toys t=new Toys();
		t.setName(name);
		t.setColor(color);
		
		return t;
	}

}
