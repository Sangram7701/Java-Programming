//thi keyword is used to invoke current class method

class ThisDemo1
{
	
	void display()
	{
		
		System.out.println("Hello...");
	}
	
	void show()
	{
		
		display();
	
	}
	
	public static void main(String[] args)
	{
		ThisDemo1 td = new ThisDemo1();
		td.show();
	}
}