package com.se;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class Sample {
	public static void main(String args[])throws Exception{  
		   FileInputStream fin1=new FileInputStream("E:/java work/sample/f1.txt");  
		   FileInputStream fin2=new FileInputStream("E:/java work/sample/f2.txt");  
		  
		   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);  
		   int i;  
		   while((i=sis.read())!=-1){  
		    System.out.println((char)i);  
		   }  
		   sis.close();  
		   fin1.close();  
		   fin2.close();  
		  }  

}
