package home_tasks.lambdaExpressions;

import java.util.*;
import java.util.Arrays;

class Employee
{
	String name;
	int id;
	Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	String getName()
	{
		return name;
	}
}
public class CollectionsSortEmployee
{
	public static void main(String[] args)
	{
		Employee emp1=new Employee("mounika",1);
		Employee emp2=new Employee("anjali",2);
		Employee emp3=new Employee("deeksha",3);
		Employee emp4=new Employee("rashmitha",4);
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		Collections.sort(list,(x,y)->{
			return (x.getName().compareTo(y.getName()));
		});
		for(Employee employee: list)
		{
			System.out.println(employee.getName());
		}
	}
}
		