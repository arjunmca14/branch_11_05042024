package com.exception._04042024;

public class FinlizeMEthodExample {
	
	public static void main(String[] args)throws Throwable  {
		
		FinlizeMEthodExample f=new FinlizeMEthodExample();
		f=null;
		
	
		
		
		
		FinlizeMEthodExample f1=new FinlizeMEthodExample();
		FinlizeMEthodExample f2=new FinlizeMEthodExample();
		f1=f2;
		
		System.gc();
		
	}
	


	@Override
	protected void finalize() throws Throwable {
		System.out.println("this is finalise method");
		
	}
}
