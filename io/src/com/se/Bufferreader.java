package com.se;
import java.io.*;
public class Bufferreader {
	public static void main(String[] args) throws Exception {
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("enter name:");
		String name=br.readLine();
		System.out.println("your name is:" +name);
		
		
	}

}
