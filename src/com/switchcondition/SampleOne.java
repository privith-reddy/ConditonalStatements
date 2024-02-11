package com.switchcondition;

public class SampleOne 
{

	public static void main(String[] args) 
	{
		Days d = new Days();
		int res = d.getDayNum("Sunday");
		System.out.println(res);
		
	}

}
class Days
{
	public int getDayNum(String dayName) 
	{
		switch(dayName)
		{
		case "Monday":
			return 1;//while ending case label either end with break or return
		case "Tuesday":
			return 2;
		case "Wednesday":
			return 3;
		case "Thursday":
			return 4;
		case "Friday":
			return 5;
		case "Saturday":
			return 6;
		case "Sunday":
			return 7;
			default:
				System.out.println("Give Proper Day Name");
				return 0;
		}
		
		
	}
	
}




