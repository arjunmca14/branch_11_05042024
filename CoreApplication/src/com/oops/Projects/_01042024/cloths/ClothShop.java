package com.oops.Projects._01042024.cloths;

import java.util.Random;

import com.oops.Projects._01042024.toyes.ToyesShopMenuCard;

public class ClothShop {

	
	public Cloths getcloths(String name,String color)
	{
		ClothsManufacture c=new ClothsManufacture();
		Cloths cloths=c.getCloths(name, color);
		
		Random r=new Random();
		int id=r.nextInt(1000);
		cloths.setId(id);
		
		cloths.setPrice(ClothsMenuCard.getPrice(cloths.getName()));
		cloths.setBarcode(r.nextLong());
		
		return cloths;
	}
}
