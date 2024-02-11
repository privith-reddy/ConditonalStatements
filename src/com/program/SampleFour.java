package com.program;

public class SampleFour 
{

	public static void main(String[] args) 
	{ 
		Days d = new Days ();
		String res =d.getDayName(2);
		System.out.println(res);
	}
}
class Days
{
	public String getDayName(int dayNo) 
	{
		if (dayNo == 1)
		{
			return "Monday";
		}
		else if (dayNo == 2) 
		{
			return "Tuesday";
		}
		else if (dayNo == 3) 
		{
			return "Wednesday";
		}
		else if (dayNo == 4) 
		{
			return "Thursday";
		}
		else if (dayNo == 5) 
		{
			return "Friday";
		}
		else if (dayNo == 6) 
		{
			return "Saturday";
		}
		else if (dayNo == 7) 
		{
			return "sunday";
		}
		else  
		{
			return "Invalid Day No";
		}
		 
	}
	
}
