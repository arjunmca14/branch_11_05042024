package com.oops._18032024;

public class MethodOverridingExample {
	
	public static void main(String[] args) {
		//1 scenario
		Parent p=new Parent();
		p.method1();
		p.method2();
//		p.method3();
		System.out.println("===========================");
		//2 scenario
		Child c=new Child();
		c.method1(); //child method
		c.method2(); //Parent method
		c.method3();  //Child method
		System.out.println("============================");
		
		//parent reference and child object
		Parent p1=new Child();
		p1.method1();//Runtime==>Child method 
		p1.method2(); //
//		p1.method3();
		System.out.println("====================");
		
		Child c1=(Child)new Parent();
		
		
	}

}
