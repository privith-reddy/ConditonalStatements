package com.program;

import java.util.Scanner;

public class SampleTwo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some number:");
		int x = sc.nextInt();
		
		if (x==10) 
		{
			System.out.println("hai");
		}
		else if (x==14) 
		{
			System.out.println("hello");
		}
			
		else if (x==20) 
		{
			System.out.println("bye");
		}
		else 
		{
			System.out.println("welcome");
		}
		
	}

}
