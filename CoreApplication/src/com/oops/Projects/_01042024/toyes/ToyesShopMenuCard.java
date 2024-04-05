package com.oops.Projects._01042024.toyes;

public class ToyesShopMenuCard {

	public static double getPrice(String toyName)
	{
		double price=0.0;
		//busimess logic
		if(toyName.equals("car"))
		{
			price=100;
		}
		if(toyName.equals("bike"))
		{
			price=50;
		}
		if(toyName.equals("teddybear"))
		{
			price=200;
		}
		
		
		
		return price;
	}
}
