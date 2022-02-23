package home_tasks.lambdaExpressions;

import java.util.Arrays;
import java.util.*;
public class SortInReverseOrder
{
  public static void main(String args[])
  {
	  List<Integer>list=Arrays.asList(10,-20,30,40,50);
	  Collections.sort(list,(num1,num2)->{if(num1==num2)
		  return 0;
	  if(num1>num2)
		  return -1;
	  else
		  return 1;
  });
	System.out.print(list);
}
}