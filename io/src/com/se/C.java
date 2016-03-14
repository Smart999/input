package com.se;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class C {
	public static void main(String args[])throws Exception{  
		FileInputStream fin=new FileInputStream("E:/java work/sample/c1.java");  
		FileOutputStream fout=new FileOutputStream("E:/java work/sample/m1.java");  
		int i=0;  
		while((i=fin.read())!=-1){  
		fout.write((byte)i);  
		}  
		fin.close();  
		}  

}
