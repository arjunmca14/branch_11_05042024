package com.flowcontrollers._14032024;

public class ContinueExample {
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if(i%2!=0)
			{
				continue;  //skip the odd numbers
			}
			System.out.println("i value>>"+i);
		}
	}

}
