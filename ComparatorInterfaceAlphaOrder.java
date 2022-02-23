package home_tasks.lambdaExpressions;

import java.util.*;
class Employee4
{
	int id;
	String name;
	Employee4(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	String getName()
	{
		return name;
	}
}
public class ComparatorInterfaceAlphaOrder
{
	public static void main(String[] args)
	{
		List<Employee4> list=Arrays.asList( new Employee4(1,"mounika"),
											new Employee4(2,"anjali"),
											new Employee4(3,"rashmitha")
											);
		Collections.sort(list,(x,y)->x.getName().compareTo(y.getName()));
		for(Employee4 i: list)
		{
			System.out.println(i.name);
		}
	}
}