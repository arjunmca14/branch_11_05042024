package com.oops.Projects._02042024;

import com.oops.Projects._01042024.cloths.ClothShop;
import com.oops.Projects._01042024.cloths.Cloths;
import com.oops.Projects._01042024.toyes.ToyiesShop;
import com.oops.Projects._01042024.toyes.Toys;

public class AllInOneShop {

	private Toys getToys(String toyname,String toycolor)
	{
		ToyiesShop t=new ToyiesShop();
		Toys toys=t.getToy(toyname,toycolor);
		return toys;
	}
	
	
	private Cloths getCloths(String clothName,String clothColor)
	{
		ClothShop c=new ClothShop();
		Cloths cloths=c.getcloths(clothName, clothColor);
		return cloths;
	}
	
	
	
	
	public GeneralItem getItem(String categiry,String itemName,String itemColor)
	{
		GeneralItem item=new GeneralItem();
		
		if(categiry.equals("cloths"))
		{
			item=getCloths(itemName, itemColor);
		}
		if(categiry.equals("toys"))
		{
			item=getToys(itemName, itemColor);
		}
		
		return item;
	}
	
	
}
