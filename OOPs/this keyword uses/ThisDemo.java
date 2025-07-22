//  this keyword is used to invoke current class constructor

class ThisDemo
{
	
	ThisDemo()
	{
		this(10);
		System.out.println("no argument constructor...!!");
	}
	
	ThisDemo(int a)
	{
		//this();
		System.out.println("Paramatarized constructor...!!");
	}
	
	public static void main(String[] args)
	{
		ThisDemo td = new ThisDemo();
	}
}