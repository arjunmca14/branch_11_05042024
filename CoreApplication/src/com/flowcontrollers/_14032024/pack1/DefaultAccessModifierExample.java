package com.flowcontrollers._14032024.pack1;

public class DefaultAccessModifierExample {
	
	String name="raju";
	
	public void method1()
	{
		System.out.println("name is >>>"+name);
	}
	
	public static void method2()
	{
		DefaultAccessModifierExample d=new DefaultAccessModifierExample();
		System.out.println("name is >>"+d.name);
	}

}
