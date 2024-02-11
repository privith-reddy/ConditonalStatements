package com.switchcondition;

public class SampleTwo 
{	
    public static void main(String[] args) 
    {
    	Number d = new Number();
    	int res=d.getDayCount(8, 2022);
    	System.out.println(res);
	}
}
	
class Number
{
	public int getDayCount(int monthNo, int year) 
	{
		switch(monthNo) 
		{
		case 1:
			return(31);
		case 2:
			if((year % 4 == 0 && year %100!=0) || (year % 400 == 0))
			{
				return(29);
			}
			else 
			{
				return(28);
			}
		case 3:
			return(31);
		case 4:
			return(30);
		case 5:
			return(31);
		case 6:
			return(30);	
		case 7:
			return(31);
		case 8:
			return(31);
		case 9:
			return(30);
		case 10:
			return(31);
		case 11:
			return(30);
		case 12:
			return(31);	
		default:
			return(0);
		}   
	 }
 }
		