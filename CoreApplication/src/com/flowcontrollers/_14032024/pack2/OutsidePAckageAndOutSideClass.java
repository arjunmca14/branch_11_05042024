package com.flowcontrollers._14032024.pack2;

import com.flowcontrollers._14032024.pack1.DefaultAccessModifierExample;
import com.flowcontrollers._14032024.pack1.ProtectedAccessModiferExample;
import com.flowcontrollers._14032024.pack1.PublicAccessModifierExample;

public class OutsidePAckageAndOutSideClass {
	
	public void method1()
	{
		PublicAccessModifierExample p=new PublicAccessModifierExample();
		System.out.println("name is>>"+p.name);
		
//		DefaultAccessModifierExample d=new DefaultAccessModifierExample();
//		System.out.println("name is >>"+d.name);
		
//		ProtectedAccessModiferExample p2=new ProtectedAccessModiferExample();
//		System.out.println("name is >>>"+p2.name);
	}
	
	public static void method2()
	{
		PublicAccessModifierExample p=new PublicAccessModifierExample();
		System.out.println("name is>>"+p.name);
		
//		DefaultAccessModifierExample d=new DefaultAccessModifierExample();
//		System.out.println("name is >>"+d.name);
		
//		ProtectedAccessModiferExample p2=new ProtectedAccessModiferExample();
//		System.out.println("name is >>>"+p2.name);

	}

}
