package com.exception._04042024;

public class NullpointerExceptionExample {

	public static void main(String[] args) {
//		String s="this";
//		System.out.println("5th charact>>"+s.charAt(5));
		
		int arr[]=new int[5];
		arr[2]=24;
		arr[1]=245;
		
		arr[10]=245;
	}
}
