package com.exception._03042024;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilesExampleForCompileTimeException {
	
	public static void main(String[] args) throws IOException {
		File f=new File("test.txt");
		FileWriter fw=new FileWriter(f);
		
		String s="this is my data";
		fw.write(s);
		fw.write("\n"); //new line

		s="this is my data";
		fw.write(s);
		fw.write("\n"); //new line
		
		s="this is my data";
		fw.write(s);
		fw.write("\n"); //new line
		
		s="this is my data";
		fw.write(s);
		fw.write("\n"); //new line
		
		fw.close();
		
	}

}
