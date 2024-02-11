package com.program;

import java.util.Scanner;

public class Vowels 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a charater:");
		char c = sc.next().charAt(0);
		
		if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u') 
		{
			System.out.println("It is a vowel");
			
		}
		else if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U') 
		{
			System.out.println("It is a vowel");	
		}
		else 
		{
			System.out.println("It is not a vowel");
		}
	}

}
