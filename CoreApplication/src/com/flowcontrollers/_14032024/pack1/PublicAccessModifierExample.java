package com.flowcontrollers._14032024.pack1;

public class PublicAccessModifierExample {
	
	public String name="raju";  //instance variable
	
	
	
	//instance method
	public void method1()
	{
		System.out.println("name is >>"+name);
	}
	
	
	//static method
	public static void method2()
	{
		PublicAccessModifierExample p=new PublicAccessModifierExample();
		System.out.println("name is >>"+p.name);
	}

}
