package com.oops.Projects._02042024.Exception;

public class ExceptionExample1 {

	public static void main(String[] args) {
		System.out.println("Step 1");
		System.out.println("Step 2");
		System.out.println("Step 3");
		System.out.println("Step 4");
		try
		{
			System.out.println("Step 5"+10/0);
		}
		catch (Exception e) {
			System.out.println("Step 5 ..please check the zero value...");
		}
		System.out.println("Step 6");
		System.out.println("Step 7");
		System.out.println("Step 8");
		System.out.println("Step 9");
	}
}
