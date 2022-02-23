package home_tasks.lambdaExpressions;

import java.util.*;
class Employee2
{
	int id;
	String name;
	
	Employee2(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	String getName() {
	return name;
	}
}
public class TreeMapEmployee
{
  public static void main(String args[]) 
  {
	  TreeMap<String,Employee2> tm=new TreeMap<String,Employee2>(
			  (x,y)->{
				  return -(x.compareTo(y));
			  });
	  Employee2 e1=new Employee2(1,"mounika");
	  Employee2 e2=new Employee2(2,"Anjali");
	  Employee2 e3=new Employee2(3,"rashmitha");
	  tm.put(e1.getName(),e1);
	  tm.put(e2.getName(),e2);
	  tm.put(e3.getName(),e3);
	  for(String x:tm.keySet())
	  {
		  System.out.print(x+" ");
	  }
  }
}