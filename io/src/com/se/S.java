package com.se;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class S {
	
		 public static void main(String args[])throws Exception{  
		  FileOutputStream fout1=new FileOutputStream("E:/java work/sample/f1.txt");  
		  FileOutputStream fout2=new FileOutputStream("E:/java work/sample/f2.txt");  
		  
		  ByteArrayOutputStream bout=new ByteArrayOutputStream();  
		  bout.write(100);  
		  bout.writeTo(fout1);  
		  bout.writeTo(fout2);  
		  
		  bout.flush();  
		  bout.close();//has no effect  
		  System.out.println("success...");  
		 }  

}
