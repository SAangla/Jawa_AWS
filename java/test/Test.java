package com.java.test;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		int a,b,c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two number:");
		a = scanner.nextInt ();
		b = scanner.nextInt ();
		c = a+b;
		
		
		System.out.println ("Total=" +c);
		
		
	}

}
