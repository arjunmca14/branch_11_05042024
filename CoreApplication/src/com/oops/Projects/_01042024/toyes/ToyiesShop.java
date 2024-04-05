package com.oops.Projects._01042024.toyes;

import java.util.Random;

public class ToyiesShop {
	
	public Toys getToy(String name,String color)
	{
		ToyManufacturePlace manufacture=new ToyManufacturePlace();
		Toys toys =manufacture.getToyManufacture(name,  color);
		
		Random r=new Random();
		int id=r.nextInt(1000);
		toys.setId(id);
		
		toys.setPrice(ToyesShopMenuCard.getPrice(toys.getName()));
		toys.setBarcode(r.nextLong());
		
		return toys;
	}

}
