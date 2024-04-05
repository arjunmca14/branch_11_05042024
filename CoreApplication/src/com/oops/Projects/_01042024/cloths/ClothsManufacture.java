package com.oops.Projects._01042024.cloths;

public class ClothsManufacture {
	
	public Cloths getCloths(String name,String color)
	{
		Cloths c=new Cloths();
		c.setName(name);
		c.setColor(color);
		
		return c;
	}

}
