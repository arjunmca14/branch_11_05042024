package com.oops._18032024;

public class OverLoadingTester {
	public static void main(String[] args) {
		OverLoadingExample o=new OverLoadingExample();
		System.out.println(o.sumcalc(30, 20, 10));
		System.out.println(o.sumcalc(300, 120, 100));
		
		
		
		System.out.println(o.sumcalc(20, 40, 10, 30, 20));
		
//		System.out.println(o.sumcalc(30, 20, 10,20));
	}

}
