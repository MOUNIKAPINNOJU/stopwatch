package home_tasks.lambdaExpressions;

import java.util.*;
class Employee3
{
	int id;
	String name;
	Employee3(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
}
public class TreeSetAlphbeticOrder
{
	public static void main(String[] args)
	{
		TreeSet<Employee3> ts=new TreeSet<Employee3>((x,y)->
		{
			return x.name.compareTo(y.name);
		});
		Employee3 emp1=new Employee3(1,"mounika");
		Employee3 emp2=new Employee3(2,"anjali");
		Employee3 emp3=new Employee3(3,"rashmitha");
		
		ts.add(emp1);
		ts.add(emp2);
		ts.add(emp3);
		for(Employee3 i : ts)
		{
			System.out.println(i.name+" ");
		}
	}
}
		