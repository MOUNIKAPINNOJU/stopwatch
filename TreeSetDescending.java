package home_tasks.lambdaExpressions;

import java.util.*;
public class TreeSetDescending {
	public static void main(String args[])
	{
		TreeSet<Integer> treeset=new TreeSet<Integer>((x,y)->
		{
			if(x==y)
				return 0;
			else if(x>y)
				return -1;
			else
				return 1;
		});
		treeset.add(1);
		treeset.add(3);
		treeset.add(2);	
		System.out.print(treeset);
	}

}