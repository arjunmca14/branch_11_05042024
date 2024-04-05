package com.flowcontrollers._14032024.pack1;

public class PrivateAccessModiferExample {
	private String name="raju";
	
	public void method1()
	{
		System.out.println("name is "+name);
	}
	
	public static void method2()
	{
		
		PrivateAccessModiferExample p=new PrivateAccessModiferExample();
		System.out.println("name is >>"+p.name);
	}

}
