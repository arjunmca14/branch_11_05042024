package com.operators._13032024;

import java.util.Scanner;

public class ShiftoperatorExample2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("what you have id proof with you? ");
		String idproof=sc.next();
		
		
		if(idproof.equals("adharcard") ||  idproof.equals("pancard") )
		{
			System.out.println("he is eligible");
		}
		else
		{
			System.out.println("he is not eligible");
		}
	}

}
