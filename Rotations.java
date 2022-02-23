package home_tasks.lambdaExpressions;

import java.util.*;
import java.util.function.BiConsumer;
public class Rotations
{
	public static void main(String[] args)
	{
		BiConsumer<String,String> bico=(first,second)->
		{
			String result=second.concat(second);
			
			if(result.contains(first))
				System.out.println("Rotations");
			else
				System.out.println("Not Rotations");
		};
		bico.accept("abc","dab");
	}
}