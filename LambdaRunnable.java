package home_tasks.lambdaExpressions;

public class LambdaRunnable
{
	public static void main(String[] args)
	{
		Runnable r=()->
		{
			for(int i=10;i<=100;i++)
			{
				System.out.print(i+" ");
			}
		};
		r.run();
	}
}