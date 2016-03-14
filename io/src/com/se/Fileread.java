package com.se;
import java.io.*;
public class Fileread {
	public static void main(String[] args)throws Exception {
		FileReader fr=new FileReader("E:/java work/sample/a.txt");
		int i;
		while ((i=fr.read())!=-1) 
			System.out.println((char)i);
			
		fr.close();
				
	}

}
