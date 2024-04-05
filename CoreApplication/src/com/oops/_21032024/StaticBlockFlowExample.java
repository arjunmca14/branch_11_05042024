package com.oops._21032024;

public class StaticBlockFlowExample {

	static int i=10;
	static{
		System.out.println("first static block");
		System.out.println("first static block>>>i>>"+i);
//		System.out.println("first static block>>j>>"+j);
	}
	
	public StaticBlockFlowExample() {
		System.out.println("constructor...");
	}
	
	static{
		System.out.println("last static block");
		System.out.println("last static block>>i>>"+i);
//		System.out.println("last static block>>j>>"+j);
	}
	
	
	static int j=20;
	
}
