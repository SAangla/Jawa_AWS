package com.java.testobject;

import java.util.Scanner;

public class TestClass {
	
	
	public TestClass() 
	{
		//public void callMethod() 
		//{
		System.out.println("Hi from Call Method");
		//}
	}
	
	public static int add ()
	{
	int a,b,c;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter two number:");
	a = scanner.nextInt ();
	b = scanner.nextInt ();
	c = a+b;
	//System.out.println ("Total=" +c);
	return c;
	}
}
