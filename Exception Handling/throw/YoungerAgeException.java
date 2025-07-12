import java.util.Scanner
class YoungerAgeException extends RuntimeExceptio 
{
	YoungerAgeException(String msg)
	{
		super(msg);
	}
}
class Voting
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		
		int age = s.nrxtInt();
		if(age<18)
		{
			throw new YoungerAgeException("You are not eligible to vote");
		}
		else
		{
			System.out.println("You can vote successfully");
		}
	}
}
