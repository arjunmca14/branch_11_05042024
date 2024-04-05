package com.flowcontrollers._14032024;

public class WhileExample {
	public static void main(String[] args) {
		int i=0;  //initialization
		while(i< 10)   //condition
		{
			//business logic
			System.out.println("i value>>"+i);
//			i=i+1;
			i++;
		}
	}

}

/*
first loop
i=0
	cond ==>i<10 ==>0<10
		syso ==>i ==>0
		i++==>i=i+1 ==>i=1
		
		
second loop
i=1
	cond ==>i<10==>1<10
		syso ==>i ==>1
		i++==>i=2

third loop
		


*/