package com.flowcontrollers._14032024.pack1;

public class OutsideClassWithSamePackage {
	
	public void method1()
	{
		PublicAccessModifierExample p=new PublicAccessModifierExample();
		System.out.println("name >>"+p.name);
		
		
//		PrivateAccessModiferExample p1=new PrivateAccessModiferExample();
//		System.out.println("name is >>"+p1.name);
		
		DefaultAccessModifierExample d=new DefaultAccessModifierExample();
		System.out.println("name is >>"+d.name);
		
		ProtectedAccessModiferExample p2=new ProtectedAccessModiferExample();
		System.out.println("name is >>>"+p2.name);
	}
	
	public static void method2()
	{
		PublicAccessModifierExample p=new PublicAccessModifierExample();
		System.out.println("name >>"+p.name);
		
//		PrivateAccessModiferExample p1=new PrivateAccessModiferExample();
//		System.out.println("name is >>"+p1.name);
		
		DefaultAccessModifierExample d=new DefaultAccessModifierExample();
		System.out.println("name is >>"+d.name);
		
		ProtectedAccessModiferExample p2=new ProtectedAccessModiferExample();
		System.out.println("name is >>>"+p2.name);
	}

}
