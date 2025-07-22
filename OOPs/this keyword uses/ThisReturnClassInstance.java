public class ThisReturnClassInstance
{
	
	ThisReturnClassInstance m1()
	{
		return this;
	}
	
	public static void main(String[] args)
	{
		
		ThisReturnClassInstance trcs = new ThisReturnClassInstance();
		trcs.m1();
		
	}
	
	
}