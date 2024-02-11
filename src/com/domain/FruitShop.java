package com.domain;

public class FruitShop 
{
	public int getTotalCost(int qty ,String fruit_name) 
	{
		int tc = 0;
		if (qty<10 && fruit_name == "apple")
		{
			tc = 15*qty;
			return tc; 
		}
		else if (qty >=10 && qty <=20 && fruit_name == "apple") 
		{
			tc = 13*qty;
			return tc;
		}
		else if (qty>20 && fruit_name == "apple") 
		{
			tc = 12*qty;
			return tc;
		}
		else if (qty<20 && fruit_name == "orange") 
		{
			tc = 8*qty;
			return tc;
		}
		else if (qty>=20 && fruit_name == "orange") 
		{
			tc = 7*qty;
			return tc;
		}
		else if (qty<100 && fruit_name == "banana") 
		{
			tc = 3*qty;
			return tc;
		}
		else if (qty>=100 && fruit_name == "banana") 
		{
			tc = 2*qty;
			return tc;
		}
		else 
		{
			System.out.println("can buy only apple or orange or banana");
			return tc;
		}
	}
}