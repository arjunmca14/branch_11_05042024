package com.flowcontrollers._14032024;

public class BreakExample {

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i+" tickect goted");
			if(i==100)
			{
				System.out.println("house full board");
				break;
			}
			
		}
	}
}
