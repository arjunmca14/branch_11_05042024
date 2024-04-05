package com.oops._21032024;

public class InstanceFlowExample {
	
	int i=10;
	
	{
		
		System.out.println("first instance block");
		System.out.println("first instance block>>i >>"+i);
//		System.out.println("first instance block>>j >>"+j);
		System.out.println("-----------------------");
	}
		
	

	InstanceFlowExample(){
		System.out.println("construcrtor");
		System.out.println("construcrtor>>i>>>"+i);
		System.out.println("construcrtor>>j>>>"+j);
		System.out.println("-----------------------");
	}
	
	
	void method1()
	{
		System.out.println("normal method");
		System.out.println("normal method>>i"+i);
		System.out.println("normal method>>j"+j);
		System.out.println("-----------------------");
	}
	
	{
		System.out.println("last instance block");
		System.out.println("last instance block>>i>>"+i);
//		System.out.println("last instance block>>j>>"+j);
		System.out.println("-----------------------");
	}

	int j=20;
}
