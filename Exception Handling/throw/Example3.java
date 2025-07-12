class Example3
{
	public static void main(String[] args)
	{
		Example3 t = new Example3();
		t.divide();
		System.out.println("Hello");
	}
	void divide()
	{
		try
		{
			int a=100, b=0, c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("Good morning1!");
	}
}	