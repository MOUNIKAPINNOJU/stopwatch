package home_tasks.lambdaExpressions;

import java.util.function.*;
public class Palindrome
{
	public static void main(String[] args)
	{
		Predicate<String> p=(String str)->
			{
				String temp="";
				int n=str.length()-1;
				for(int i=n;i>=0;i--)
				{
					temp+=str.charAt(i);
				}
				if(temp.equals(str))
					return true;
				return false;
				
			};
		System.out.println(p.test("mom"));
	}
}