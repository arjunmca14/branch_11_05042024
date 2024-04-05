package com.exception._03042024;

public class ExcreptionExmaple2 {



	public static void main(String[] args) {
		System.out.println("this is main method");
		ExcreptionExmaple2 t= new ExcreptionExmaple2();
		t.method1();
	}
	
	public void method1()
	{
		System.out.println("this is method1");
		method2();
	}
	
	public void method2()
	{
		System.out.println("this is method2");
		method3();
	}
	
	public void method3()
	{
		try
		{	
			System.out.println("this is method3"+10/0);
		}
		catch (Exception e) {
//			System.out.println("boss please check the issue...");
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
	}

}
