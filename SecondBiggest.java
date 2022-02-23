package home_tasks.lambdaExpressions;

import java.util.function.Consumer;
import java.util.List;
import java.util.stream.Collectors; 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class SecondBiggest
{
	public static void main(String[] args)
	{
		Integer arr[]={1,2,3,4,5};
		List<Integer> list=Arrays.asList(arr);
		Consumer<List<Integer>> c = list1->{
			
			//List<Integer> sortedList= list1.stream().sorted().collect(Collectors.toList());
			Collections.sort(list1,Collections.reverseOrder());
			System.out.println(list1.get(1));
		};
		c.accept(list);
	}
}