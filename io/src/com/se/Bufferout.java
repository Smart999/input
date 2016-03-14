package com.se;
import java.io.*;
public class Bufferout {
	public static void main(String[] args) throws Exception {
		FileOutputStream fout=new FileOutputStream("E:/java work/sample/f1.text");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="my name is rajendra";
		byte b[]=s.getBytes();
		bout.write(b);
		
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("sucess");
		
	}

}
