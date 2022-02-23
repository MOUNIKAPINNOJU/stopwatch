package home_tasks.lambdaExpressions;

import java.util.*;
class TreeMapValuesSort
{
	public static void main(String[] args)
	{
		TreeMap<Integer,String> tm= new TreeMap<Integer,String>((x,y)->
		{
			if(x==y)
				return 0;
			else if(x>y)
				return -1;
			else
				return 1;
		});
			;
		tm.put(1,"mounika");
		tm.put(3,"rashmitha");
		tm.put(2,"anjali");
		System.out.println(tm);
	}
}
		