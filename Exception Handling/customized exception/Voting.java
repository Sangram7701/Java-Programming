class UnderAgeException extends Exception
{
	UnderAgeException()
	{
		super("You are under age");
	}
	UnderAgeException(String message)
	{
		super(message);
	}
}
class Voting
{
	public static void main(String[] args)
	{
		int age = 17;
		try
		{
			if(age<18)
			{
				throw new UnderAgeException("You cannot vote as your age is below 18");
			}
			else {
				System.out.println("You can vote now");
			}
		}
		catch(UnderAgeException e)
		{
			e.printStackTrace();
		}
		System.out.println("Hello madam!");
	}
}