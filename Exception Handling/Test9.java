class Test9
{
	public static void main(String[] args)
	{
		try
		{
			int a=100, b=2,c;
			c=a/b;
			System.out.println(c);
		}
		finally
		{
			System.out.println("I am in finally block");
		}
	}
}