package com.exception._03042024;

import java.io.File;
import java.io.IOException;

public class ThrowsKeywordExample {

	public static void main(String[] args) throws IOException {
		System.out.println("this is main method");
		ThrowsKeywordExample t= new ThrowsKeywordExample();
		t.method1();
	}
	
	public void method1() throws IOException
	{
		System.out.println("this is method1");
		method2();
	}
	
	public void method2() throws IOException
	{
		System.out.println("this is method2");
		method3();
	}
	
	public void method3() throws IOException
	{
		System.out.println("this is method3");
		File f=new File("asdasfasf.txt");
		f.createNewFile();
	}
}
