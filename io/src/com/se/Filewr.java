package com.se;
import java.io.*;
public class Filewr {
public static void main(String[] args) throws Exception {
	try{
	FileWriter fw=new FileWriter("E:/java work/sample/a.txt");
	fw.write("rajendra prasad");
	fw.close();

	
	
	}
	catch(Exception e)
	{
		System.out.println("e");
	}
	System.out.println("sucess");
}
}
