//this can be used to pass as an argument in the method call

class ThisMethodCall
{
	
	void m1(ThisMethodCall tmc)
	{
		
		System.out.println("I m in m1 method");
		
	}
	
	void m2()
	{
		
		m1(this);
		
	}
	
	public static void main(String[] args)
	{
		
		ThisMethodCall tmc = new ThisMethodCall();
		tmc.m2();
		
	}
	
	
}

