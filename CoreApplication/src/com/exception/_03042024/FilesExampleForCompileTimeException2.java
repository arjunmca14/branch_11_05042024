package com.exception._03042024;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilesExampleForCompileTimeException2 {
	
	public static void main(String[] args)  {
		FileWriter fw=null;
		try
		{
		File f=new File("test.txt");
		fw=new FileWriter(f);
		
		String s="Select the Item";
		fw.write(s);
		fw.write("\n"); //new line

		s="add cart ";
		fw.write(s);
		fw.write("\n"); //new line
		
		s="payment for that item";
		fw.write(s);
		fw.write("\n"); //new line
		
		s="delevery to your address";
		fw.write(s);
		fw.write("\n"); //new line
		
//		fw.close();
		
		}
		catch (Exception e) {
			System.out.println("please check files data");
			
//			try {
//				fw.close();
//			} catch (IOException e1) {
//				e1.printStackTrace();
//			}
		}
		finally {  //mandatory statements
			try {
				fw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		}

}
