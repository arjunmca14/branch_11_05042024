package com.flowcontrollers._14032024;

public class ReturnExample1 {

	public static void main(String[] args) {
		System.out.println(ReturnExample1.sum(40, 30, 10));
	}
	
	
	public static int sum(int a,int b, int c)
	{
		int sum=a+b+c;
		
		return sum;
	}
}
