package com . program;

import java.util.Scanner;

public class SampleThree 
{

	public static void main(String[] args) 
	{
		int a = 100;
		if (a>10) 
		{
			System.out.println("Hello");
		}
		else 
		{
			System.out.println("Hi");
			
		}
		//sample four
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Fruit Name:");
		
		String fruitName = sc.next().intern();
		
				
		if (fruitName == "apple") 
		{
			System.out.println("One");
		}
		else if (fruitName == "banana") 
		{
			System.out.println("Two");
		}
		else if (fruitName == "mango") 
		{
			System.out.println("Three");
		}
		else 
		{
			System.out.println("Four");
			
		}
		// Sample  five
		boolean b1 = true;
		if (b1== true) 
		{
			System.out.println("Hello");
			
		}

	}

}
