import java.util.Scanner;
class YoungerAgeException extends RuntimeException
{
	YoungerAgeException(String msg)
	{
		super(msg);
	}
}
class Voting1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		
		int age = s.nextInt();
		try
		{
			if(age<18)
			{
				throw new YoungerAgeException("You are not eligible to vote");
			}
			else
			{
				System.out.println("You can vote successfully");
			}
		}
		catch(YoungerAgeException e)
		{
			System.out.println(e);
		}
		System.out.println("Hello madam I love you so much! Will you marry me.");
	}
}
