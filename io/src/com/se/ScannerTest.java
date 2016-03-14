package com.se;

import java.util.Scanner;

public class ScannerTest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name:");
	String name=sc.next();
	System.out.println("enter id:");
	int id=sc.nextInt();
	System.out.println("roll:"  +id+    "name:"  +name);
	
}	

}
