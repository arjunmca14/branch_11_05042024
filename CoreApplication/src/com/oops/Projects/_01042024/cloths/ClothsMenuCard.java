package com.oops.Projects._01042024.cloths;

public class ClothsMenuCard {
	public static double getPrice(String clothName)
	{
		double price=0.0;
		//busimess logic
		if(clothName.equals("suite"))
		{
			price=1000;
		}
		if(clothName.equals("geans"))
		{
			price=500;
		}
		if(clothName.equals("tshirt"))
		{
			price=250;
		}
		
		
		
		return price;
	}


}
