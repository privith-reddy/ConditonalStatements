package com.program;

public class LeapYear 
{
//Leap year divide with 4&400 reminder will be '0'.
//divide with 100 means not equal to '0'.
	public static void main(String[] args) 

	{
		int y = 2024;
		if((y % 4 == 0 && y %100!=0) || (y % 400 == 0))
		{
			System.out.println("It is a leap year");
		}
		else 
		{
			System.out.println("It is a not a leap year");
		}
	}
}
