package Study01_Package;

public class Sum {
	private int number =0;
	public void sum(int n)
	{
		for(int i=1; i<=n; i++)
		{
			number += i;
		}
	}
	public void print()
	{
		System.out.println(number);
	}
}
