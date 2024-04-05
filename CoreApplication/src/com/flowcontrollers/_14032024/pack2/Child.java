package com.flowcontrollers._14032024.pack2;

import com.flowcontrollers._14032024.pack1.Parent;

public class Child extends Parent{  //Child is a Parent
	
	public void method1()
	{
//		Parent p=new Parent();
//		System.out.println(p.name);
		
		Child c=new Child();
		System.out.println("name is >>"+super.name);
	}
	
	
	public static void method2()
	{
		Child c=new Child();
		System.out.println(c.name);
	}
	

}
