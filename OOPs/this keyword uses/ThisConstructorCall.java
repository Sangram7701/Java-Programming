//this can be used to pass as an argument in the constructor call

class Test
{
	
	Test(ThisConstructorCall tcc)
	{
		
		System.out.println("Test class constructor...");
		
	}
	
}

class ThisConstructorCall
{
	
	void m1()
	{
		
		Test t = new Test(this);
		
	}
	
	
	public static void main(String[] args)
	{
		
		ThisConstructorCall tcc = new ThisConstructorCall();
		tcc.m1();
		
	}
	
	
}

