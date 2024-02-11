package com.domain;

public class MyProgram 
{

	public static void main(String[] args) 
	{
		FruitShop fs = new FruitShop();
		int res = fs.getTotalCost(30, "mango");
		System.out.println(res);
		
	}

}
