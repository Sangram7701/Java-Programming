// this keyword can be used to refer current class instance variable

class ThisInstanceVariable
{
	
	int i;
	void setValue(int i)
	{
		this.i = i;
	}
	
	void show()
	{
		System.out.println(i);
	}
	
	public static void main(String[] args)
	{
		
		ThisInstanceVariable tiv = new ThisInstanceVariable();
		tiv.setValue(1000);
		tiv.show();
		
	}
}