package com.oops._18032024;

public class MethodHidinhExample {

	public static void main(String[] args) {
		Parent1 p=new Parent1();
		p.method1();
		p.method2();
		System.out.println("==============");
		Child1 c=new Child1();
		c.method1(); //Child
		c.method2();  //parent
		c.method3(); //child
		
		System.out.println("===================");
		Parent1 p1=new Child1();
		p1.method1();//PArent
		p1.method2();//parent
		
				
		
	}
}
