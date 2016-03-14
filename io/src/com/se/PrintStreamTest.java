package com.se;
import java.io.*;
public class PrintStreamTest{
	public static void main(String[] args) throws Exception {
		

	FileOutputStream fout=new FileOutputStream("E:/java work/sample/a11.txt");  
	   PrintStream pout=new PrintStream(fout);  
	   pout.println(1900); 
	   pout.println("Hello Java");  
	   pout.println("Welcome to Java");  
	   pout.close();  
	   fout.close();  
	      
	 }  

}
