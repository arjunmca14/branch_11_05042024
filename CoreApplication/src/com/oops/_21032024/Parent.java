package com.oops._21032024;

public class Parent {
	
//	Parent()
//	{
//		System.out.println("this is parent default constrcutor");
//	}
//	
	Parent(int id,String name)
	{
		this(id);
		System.out.println("parent parameterised constructor with id and name");
	}
	
	Parent(String name)
	{
//		this();
		System.out.println("parent parameterised constructor with name");
	}
	
	Parent(int id)
	{
		this("rakesh");
		System.out.println("parent parameterised constructor with id");
	}

}
