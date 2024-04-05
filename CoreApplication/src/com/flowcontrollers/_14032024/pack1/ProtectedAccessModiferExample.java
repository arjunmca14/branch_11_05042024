package com.flowcontrollers._14032024.pack1;

public class ProtectedAccessModiferExample {

	protected String name="Raju";
	
	public void method1()
	{
		System.out.println("name is >>"+name);
	}
	
	public static void method2()
	{
		ProtectedAccessModiferExample p=new ProtectedAccessModiferExample();
		System.out.println("name is >>>"+p.name);
	}
}
