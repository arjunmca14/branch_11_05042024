package com.operators._13032024;

public class IncrementOperators {
	public static void main(String[] args) {
		int i=90;
		i++;   //i=i+1;
		System.out.println(i);  //91
		
		System.out.println("---------------------------");
		i=90;
		++i;
		System.out.println(i);
		
		System.out.println("============");
		
		i=1;
		System.out.println(i++); //first i will print after incrment 
		
		System.out.println(i);
		System.out.println("=====================");
		i=1;
		System.out.println(++i);
	}

}
