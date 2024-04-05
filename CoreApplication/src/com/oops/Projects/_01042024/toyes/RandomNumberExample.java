package com.oops.Projects._01042024.toyes;

import java.util.Random;

public class RandomNumberExample {

	public static void main(String[] args) {
		Random r=new Random();
		System.out.println(r.nextInt(1000));
		
		System.out.println(Math.abs(r.nextLong()));
	}
}
