package com.program;
public class NestedCondition 
{

	public static void main(String[] args) 
	{
		FruitShop fs = new FruitShop();
		int res = fs.getTotalCost(200, "banana");
		System.out.println(res);
	}

}
class FruitShop 
{
	public int getTotalCost(int qty ,String fruitName) 
	{
		int tc = 0;
		if ( fruitName == "apple")
		{
			if(qty<10) 
			{
				tc = 15*qty;
				return tc;
			}
			else if (qty >=10 && qty <=20 ) 
			{
				tc = 13*qty;
				return tc;
			}
			else 
			{
				tc = 12*qty;
				return tc;
			}
		}
		else if (fruitName == "orange") 
		{
			if(qty < 20) 
			{ 
			tc = 8*qty;
			return tc;
		    }
		    else 
		    {
		    	tc = 7*qty;
				return tc;
		    }
		
		}
		else if (fruitName == "banana")
		{
		    if (qty<100) 
			{
				tc = 3*qty;
				return tc;
			}
			else
			{
				tc = 2*qty;
				return tc;	
			}
		}
		else 
		{
		    System.out.println("can buy only apple or orange or banana");
		    return tc;
		}
	}
	
}




