package com.se;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArray {
	public static void main(String args[])throws Exception{  
		  
		  CharArrayWriter out=new CharArrayWriter();  
		  out.write("my name is");  
		  
		  FileWriter f1=new FileWriter("E:/java work/sample/a.txt");  
		  FileWriter f2=new FileWriter("E:/java work/sample/b.txt");  
		  FileWriter f3=new FileWriter("E:/java work/sample/c.txt");  
		  FileWriter f4=new FileWriter("E:/java work/sample/d.txt");  
		  
		  out.writeTo(f1);  
		  out.writeTo(f2);  
		  out.writeTo(f3);  
		  out.writeTo(f4);  
		  
		  
		  f1.close();  
		  f2.close();  
		  f3.close();  
		  f4.close();  
		 }  

}
